package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class J2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("update student set sname =? where id =?");
			pst.setString(1, "arjun");
			pst.setInt(2, 2);
			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + "rows updated");
			} else {
				System.err.println("Something went wrong");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
