package com.dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dbconnection implements StudentInterface {

	public void insertStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
					"root","root");
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1, 6);
			pst.setString(2, "bhargav");
			pst.setString(3, "Ece");
			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + "rows inserted");
			} else {
				System.out.println("something went wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	@Override
	public void getAllStudents() {
		
		
	}

}
