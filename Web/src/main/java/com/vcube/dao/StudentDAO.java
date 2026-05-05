package com.vcube.dao;

import java.sql.DriverManager;

import com.vcube.dto.Student;

public class StudentDAO {

	public String register(Student s) {
		String status = "failure";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
