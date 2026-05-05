package com.projects;
import java.sql.*;
import java.util.*;

public class StudentManagementSystem {

    // ✅ Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // your MySQL username
    private static final String PASS = "yourpassword"; // your MySQL password

    // ✅ Method to get connection
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL Driver
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found! Add mysql-connector-j to your project.");
        } catch (SQLException e) {
            System.out.println("❌ Database connection failed: " + e.getMessage());
        }
        return con;
    }

    // ✅ Method to add a student
    public static void addStudent(int id, String name, String email, String course) {
        String sql = "INSERT INTO students (id, name, email, course) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, course);
            ps.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Error adding student: " + e.getMessage());
        }
    }

    // ✅ Method to view all students
    public static void viewStudents() {
        String sql = "SELECT * FROM students";
        try (Connection con = getConnection(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            System.out.println("\n===== Student Records =====");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email") +
                        ", Course: " + rs.getString("course"));
            }
        } catch (SQLException e) {
            System.out.println("❌ Error fetching students: " + e.getMessage());
        }
    }

    // ✅ Method to update a student's course
    public static void updateStudent(int id, String newCourse) {
        String sql = "UPDATE students SET course = ? WHERE id = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, newCourse);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student updated successfully!");
            } else {
                System.out.println("⚠️ No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error updating student: " + e.getMessage());
        }
    }

    // ✅ Method to delete a student
    public static void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("🗑️ Student deleted successfully!");
            } else {
                System.out.println("⚠️ No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error deleting student: " + e.getMessage());
        }
    }

    // ✅ Main menu (console app)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    addStudent(id, name, email, course);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to Update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    updateStudent(id, newCourse);
                    break;

                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    id = sc.nextInt();
                    deleteStudent(id);
                    break;

                case 5:
                    System.out.println("🚀 Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        }
    }
}
