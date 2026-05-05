package com.project.utility;

import java.sql.*;

public class DBConnection {
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/studentdb",
                        "root",
                        "root"     // change password if needed
                );
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
