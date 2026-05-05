package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("update student set sname =? ,branch =? where id =?");
			pst.setString(1, "sasidhar ");
			pst.setString(2, "Ece");
			pst.setInt(3, 2);
			int n = pst.executeUpdate();
			pst.setString(1, "arjun reddy");
			pst.setString(2, "cse");
			pst.setInt(3, 1);
			int n1 = pst.executeUpdate();
			int n2=n+n1;
			if (n2 > 0) {
				System.out.println(n2 + "rows updated");
			} else {
				System.out.println("something went wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
