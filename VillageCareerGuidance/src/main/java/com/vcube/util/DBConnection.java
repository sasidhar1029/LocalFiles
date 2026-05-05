package com.vcube.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/village_career?useSSL=false&serverTimezone=UTC";
	private static final String USER = "root"; // change as required
	private static final String PASS = "root";

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER, PASS);
	}
}