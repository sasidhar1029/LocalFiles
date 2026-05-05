package com.project.dao;

import java.sql.*;
import java.util.*;
import com.project.dto.Student;
import com.project.utility.DBConnection;

public class StudentDAO {

    public boolean addStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO students VALUES (?,?,?,?)");
            pst.setInt(1, s.getId());
            pst.setString(2, s.getName());
            pst.setDouble(3, s.getMarks());
            pst.setString(4, s.getDept());
            return pst.executeUpdate() > 0;
        } catch (Exception e) { return false; }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = pst.executeQuery();
            while (rs.next())
                list.add(new Student(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4)));
        } catch (Exception e) {}
        return list;
    }

    public Student getStudentById(int id) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM students WHERE id=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
                return new Student(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
        } catch (Exception e) {}
        return null;
    }

    public boolean updateStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
                    "UPDATE students SET name=?, marks=?, dept=? WHERE id=?");
            pst.setString(1, s.getName());
            pst.setDouble(2, s.getMarks());
            pst.setString(3, s.getDept());
            pst.setInt(4, s.getId());
            return pst.executeUpdate() > 0;
        } catch (Exception e) { return false; }
    }

    public boolean deleteStudent(int id) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("DELETE FROM students WHERE id=?");
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;
        } catch (Exception e) { return false; }
    }
}
