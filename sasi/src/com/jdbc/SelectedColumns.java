package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectedColumns {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("Select branch from students");
			ResultSet re = pst.executeQuery();
			while (re.next()) {

				System.out.println(re.getString("branch"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
