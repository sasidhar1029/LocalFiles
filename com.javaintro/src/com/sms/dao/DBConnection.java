package com.sms.dao;
import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "yourpassword";

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println(" Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println(" JDBC Driver not found! Add mysql-connector-j to your project.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to database!");
            e.printStackTrace();
        }
        return con;
    }
}
