package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student {
	static String url = "jdbc:mysql://localhost:3306/jdbc";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement pst = con.prepareStatement("insert into students(id,sname,branch,marks) values ?,?,?,?");
			pst.setInt(1, 1);
			pst.setString(2, "sasi");
			pst.setString(3, "Ece");
			pst.setInt(4, 100);
			int n = pst.executeUpdate();
			pst.setInt(1, 2);
			pst.setString(2, "sasidhar");
			pst.setString(3, "Cse");
			pst.setInt(4, 80);
			int n1 = pst.executeUpdate();
			pst.setInt(1, 3);
			pst.setString(2, "arjun");
			pst.setString(3, "Mech");
			pst.setInt(4, 60);
			int n2 = pst.executeUpdate();
			pst.setInt(1, 4);
			pst.setString(2, "reddy");
			pst.setString(3, "civil");
			pst.setInt(4, 70);
			int n3 = pst.executeUpdate();
			pst.setInt(1, 5);
			pst.setString(2, "nikhel");
			pst.setString(3, "eee");
			pst.setInt(4, 98);
			int n4 = pst.executeUpdate();
			int n5 = n + n1 + n2 + n3 + n4;
			if (n > 0) {
				System.out.println(n5 + "Rows inserted");
			} else {
				System.out.println("Something went wrong");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
