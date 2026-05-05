package com.sms.dao;

import java.sql.*;
import com.sms.dto.Student;
import com.sms.utility.DBConnection;

public class StudentDAO {

    public boolean register(Student s) {
        boolean status = false;
        String sql = "INSERT INTO students(fullname, username, password, email, mobile) VALUES(?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getFullname());
            ps.setString(2, s.getUsername());
            ps.setString(3, s.getPassword());
            ps.setString(4, s.getEmail());
            ps.setString(5, s.getMobile());

            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public Student login(String username, String password) {
        Student s = null;
        String sql = "SELECT * FROM students WHERE username=? AND password=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                s = new Student();
                s.setId(rs.getInt("id"));
                s.setFullname(rs.getString("fullname"));
                s.setUsername(rs.getString("username"));
                s.setEmail(rs.getString("email"));
                s.setMobile(rs.getString("mobile"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public Student getById(int id) {
        Student s = null;
        String sql = "SELECT * FROM students WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = new Student();
                s.setId(rs.getInt("id"));
                s.setFullname(rs.getString("fullname"));
                s.setUsername(rs.getString("username"));
                s.setEmail(rs.getString("email"));
                s.setMobile(rs.getString("mobile"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public boolean updateProfile(Student s) {
        boolean status = false;
        String sql = "UPDATE students SET fullname=?, email=?, mobile=? WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getFullname());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getMobile());
            ps.setInt(4, s.getId());

            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public boolean updatePassword(String username, String newPassword) {
        boolean status = false;
        String sql = "UPDATE students SET password=? WHERE username=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newPassword);
            ps.setString(2, username);
            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
