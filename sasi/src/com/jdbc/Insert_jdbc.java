package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_jdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:/jdbc", "root", "root");

			PreparedStatement pst = con.prepareStatement("insert into students values(?,?,?)");
			pst.setInt(1, 12);
			pst.setString(2, "Dhoni");
			pst.setInt(3,100);
			pst.setString(4, "Ece");
			
			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + " : rows inserted");
			}
			System.err.println("something went wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
