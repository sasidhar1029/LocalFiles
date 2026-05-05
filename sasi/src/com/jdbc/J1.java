package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class J1 {

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc", "root", "root"
            );

            // Create statement
            Statement st = con.createStatement();

            // Insert data into table
            int n = st.executeUpdate("INSERT INTO student VALUES (2, 'sos', 'cse'),(3,'subbu','ece')");

            if (n > 0) {
                System.out.println("✅ " + n + " record(s) inserted successfully!");
            } else {
                System.out.println("⚠️ Something went wrong");
            }

            // Close connection
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
