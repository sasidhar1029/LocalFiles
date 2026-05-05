package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_jdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc"
					,"root","root");
			PreparedStatement pst =con.prepareStatement("drop table student");
			
			 pst.execute();
//			if(n>0) {
//				System.out.println(n+"rows deleted");
//			}else {
//				System.err.println("Something went wrong");
//			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
