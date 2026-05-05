package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ins_jdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("insert into students values(?,?,?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "arju");
			pst.setString(3, "Cse");
			pst.setInt(4, 100);
			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + "rows inserted");
			} else {
				System.err.println("Something went wrong");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
