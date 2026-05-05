package com.vcube.dao;

import java.sql.*;
import java.util.List;

import com.vcube.model.CartItem;

public class OrderDAO {

	public static boolean placeOrder(int userId, String address, List<CartItem> cart) {

		Connection con = null;

		try {
			con = DBUtil.getConnection();
			con.setAutoCommit(false); // 🔴 Start Transaction

			// 1️⃣ Calculate total amount
			double total = 0;
			for (CartItem c : cart) {
				total += c.price * c.qty;
			}

			// 2️⃣ Insert into orders table
			PreparedStatement psOrder = con.prepareStatement(
					"INSERT INTO orders(user_id, address, total) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

			psOrder.setInt(1, userId);
			psOrder.setString(2, address);
			psOrder.setDouble(3, total);
			psOrder.executeUpdate();

			// 3️⃣ Get generated order_id
			ResultSet rs = psOrder.getGeneratedKeys();
			rs.next();
			int orderId = rs.getInt(1);

			// 4️⃣ Insert into order_details table
			PreparedStatement psDetails = con
					.prepareStatement("INSERT INTO order_details(order_id, food_id, quantity, price) VALUES (?,?,?,?)");

			for (CartItem c : cart) {
				psDetails.setInt(1, orderId);
				psDetails.setInt(2, c.foodId);
				psDetails.setInt(3, c.qty);
				psDetails.setDouble(4, c.price);
				psDetails.addBatch();
			}

			psDetails.executeBatch();

			con.commit(); // ✅ Commit Transaction
			return true;

		} catch (Exception e) {
			try {
				if (con != null)
					con.rollback(); // ❌ Rollback on error
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
			return false;
		}
	}
}
