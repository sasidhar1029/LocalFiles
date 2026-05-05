package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.model.LoginModel;
import com.vcube.model.Student;

public class StudentDAO implements StudentDAOInterface {
	String status = "failure";

	@Override
	public String insertStudent(Student s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con
					.prepareStatement("insert into users (username,fullname,password) values(?,?,?)");
			pst.setString(1, s.getUsername());
			pst.setString(2, s.getFullname());
			pst.setString(3, s.getPassword());

			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + "rows inserted");
				status = "success";
			} else {
				System.out.println("Something went wrong");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override
	public String selectStudent(LoginModel lm) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement pst = con.prepareStatement("select * from users where username =? and password=?");
			pst.setString(1, lm.getUsername());
			pst.setString(2, lm.getPassword());

			ResultSet rs = pst.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			if (count > 0) {
				status = "success";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
