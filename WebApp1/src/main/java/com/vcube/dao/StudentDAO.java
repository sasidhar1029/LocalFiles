package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO implements Student_Interface{
	
	@Override
	public void insertStudents() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb",
					"root","root");
			PreparedStatement pst = con.prepareStatement("insert into students values (?,?,?,?)");
			pst.setInt(1, 21);
			pst.setString(2, "sasidharreddy");
			pst.setString(3, "sasi");
			pst.setString(4, "arjun721");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
