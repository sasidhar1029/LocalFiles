package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Practice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("select branch from students ");
//			pst.setInt(1, 3);
			ResultSet n = pst.executeQuery();
//			while(n.next()) {
//				System.out.println(n.getInt(1)+":"+n.getString(2)+":"+n.getString(3)+":"+n.getInt(4));
//			}
			while (n.next()) {
				System.out.println(n.getString("branch"));
			}
//			
//			if (n > 0) {
//				System.out.println(n + "rows deleted");
//			} else {
//				System.err.println("Something went wrong");
//			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
