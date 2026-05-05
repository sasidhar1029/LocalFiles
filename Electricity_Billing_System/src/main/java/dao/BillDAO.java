package dao;

import model.Bill;
import java.sql.*;

public class BillDAO {

	// ⭐ Bill Calculation
	public static double calculateAmount(int units) {
		if (units <= 100)
			return units * 5;
		else if (units <= 300)
			return units * 7;
		else
			return units * 10;
	}

	// ⭐ Generate Bill
	public static boolean generateBill(Bill b) {
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con
						.prepareStatement("insert into bill(meter_no,units,amount,status) values(?,?,?,?)")) {

			ps.setString(1, b.getMeterNo());
			ps.setInt(2, b.getUnits());
			ps.setDouble(3, b.getAmount());
			ps.setString(4, b.getStatus());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// ⭐ Payment Update (VERY IMPORTANT ⭐)
	public static boolean markAsPaid(String meterNo) {
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("update bill set status='PAID' where meter_no=?")) {

			ps.setString(1, meterNo);

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// ⭐ Get Bill (useful for view page)
	public static Bill getBillByMeter(String meterNo) {
		Bill b = null;

		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con
						.prepareStatement("select * from bill where meter_no=? order by id desc limit 1")) {

			ps.setString(1, meterNo);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = new Bill();
				b.setId(rs.getInt("id"));
				b.setMeterNo(rs.getString("meter_no"));
				b.setUnits(rs.getInt("units"));
				b.setAmount(rs.getDouble("amount"));
				b.setStatus(rs.getString("status"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
}