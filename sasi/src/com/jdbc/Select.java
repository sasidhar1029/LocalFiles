package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("Select*from students");
			ResultSet n = pst.executeQuery();
			while (n.next()) {
				System.out.println(n.getInt(1) + "," + n.getString(2) + "," + n.getString(3));
			}

		} catch (Exception e) {
                                        
		}

	}

}
