package com.vcube.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.execute("CREATE DATABASE IF NOT EXISTS village_career");
            st.execute("USE village_career");

            st.execute(
                "CREATE TABLE IF NOT EXISTS experts (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "sector VARCHAR(50) NOT NULL," +
                "short_bio VARCHAR(500)," +
                "linkedin VARCHAR(255)," +
                "email VARCHAR(255)," +
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)"
            );

            System.out.println("Database & table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
