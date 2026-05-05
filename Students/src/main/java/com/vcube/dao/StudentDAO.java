package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.model.LoginModel;
import com.vcube.model.Student;

public class StudentDAO implements StudentDAOInterface{
	String status = "failure";
	@Override
	public String insertStudent(Student s) {
		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b612","root","root");
			PreparedStatement ps = con.prepareStatement("insert into students(username, fullname, password) values(?, ?, ?)");
			ps.setString(1, s.getUsername());
			ps.setString(2, s.getFullname());
			ps.setString(3, s.getPassword());
			int n = ps.executeUpdate();
			if(n>0) {
				status = "success";
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}

	public String selectStudent(LoginModel lm) {
		
		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b612","root","root");
			PreparedStatement ps = con.prepareStatement("select * from students where username = ? and password = ?");
			ps.setString(1, lm.getUsername());
			ps.setString(2, lm.getPassword());
			ResultSet rs = ps.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
			}
			if(count>0) {
				status = "success";
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
}
