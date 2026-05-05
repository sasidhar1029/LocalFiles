package com.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CRUDExample {

    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root", "root");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- CRUD Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    // CREATE (INSERT)
                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter branch: ");
                        String branch = sc.next();
                        System.out.print("Enter marks: ");
                        int marks = sc.nextInt();

                        PreparedStatement insert = con.prepareStatement(
                                "INSERT INTO student (sname, branch, marks) VALUES (?, ?, ?)");
                        insert.setString(1, name);
                        insert.setString(2, branch);
                        insert.setInt(3, marks);
                        int rows = insert.executeUpdate();
                        System.out.println(rows + " record inserted.");
                        break;

                    // READ (SELECT)
                    case 2:
                        PreparedStatement read = con.prepareStatement("SELECT * FROM student");
                        ResultSet rs = read.executeQuery();
                        System.out.println("ID\tName\tBranch\tMarks");
                        System.out.println("-------------------------------");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" +
                                               rs.getString("sname") + "\t" +
                                               rs.getString("branch") + "\t" +
                                               rs.getInt("marks"));
                        }
                        break;

                    // UPDATE
                    case 3:
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();

                        PreparedStatement update = con.prepareStatement(
                                "UPDATE student SET marks = ? WHERE id = ?");
                        update.setInt(1, newMarks);
                        update.setInt(2, uid);
                        int updated = update.executeUpdate();
                        System.out.println(updated + " record updated.");
                        break;

                    // DELETE
                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        PreparedStatement delete = con.prepareStatement(
                                "DELETE FROM student WHERE id = ?");
                        delete.setInt(1, did);
                        int deleted = delete.executeUpdate();
                        System.out.println(deleted + " record deleted.");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 5);

            // Close resources
            sc.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
