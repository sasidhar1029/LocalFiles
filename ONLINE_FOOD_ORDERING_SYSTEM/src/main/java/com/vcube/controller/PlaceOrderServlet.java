package com.vcube.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.vcube.dao.DBUtil;
import com.vcube.model.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PlaceOrderServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession session = req.getSession();
		List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
		int uid = (int) session.getAttribute("uid");
		String address = req.getParameter("address");

		try {
			Connection con = DBUtil.getConnection();
			con.setAutoCommit(false);

			double total = 0;
			for (CartItem c : cart)
				total += c.price * c.qty;

			PreparedStatement ps = con.prepareStatement("insert into orders(user_id,address,total) values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, uid);
			ps.setString(2, address);
			ps.setDouble(3, total);
			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			int orderId = rs.getInt(1);

			PreparedStatement ps2 = con
					.prepareStatement("insert into order_details(order_id,food_id,quantity,price) values(?,?,?,?)");

			for (CartItem c : cart) {
				ps2.setInt(1, orderId);
				ps2.setInt(2, c.foodId);
				ps2.setInt(3, c.qty);
				ps2.setDouble(4, c.price);
				ps2.addBatch();
			}
			ps2.executeBatch();
			con.commit();

			session.removeAttribute("cart");
			res.getWriter().print("Order Placed Successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
