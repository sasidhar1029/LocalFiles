package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class SelectById implements Student_Interface {

	// Method to select a student by ID
	public void insertStudent() {
		try {
			// Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			// Prepare SQL statement
			PreparedStatement pst = con.prepareStatement("insert into students values (?,?,?,?)");
			pst.setInt(1, 6);
			pst.setString(2, "arjun");
			pst.setString(3, "Cse");
			pst.setInt(4, 68);

			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + "rows inserted");
			} else {
				System.out.println("something went wrong");
			}

			// Close resources

			pst.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void getAllStudents() {
		// Not implemented yet
	}

	// Main method to test

}
