package com.sms.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.sms.dto.Course;
import com.sms.utility.DBConnection;

public class CourseDAO {

    public boolean addCourse(Course c) {
        boolean status = false;
        String sql = "INSERT INTO courses(student_id, course_name, duration, start_date, progress, status) VALUES(?,?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, c.getStudentId());
            ps.setString(2, c.getCourseName());
            ps.setString(3, c.getDuration());
            ps.setString(4, c.getStartDate());
            ps.setInt(5, c.getProgress());
            ps.setString(6, c.getStatus());

            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public List<Course> getCoursesByStudent(int studentId) {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT * FROM courses WHERE student_id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getInt("id"));
                c.setStudentId(rs.getInt("student_id"));
                c.setCourseName(rs.getString("course_name"));
                c.setDuration(rs.getString("duration"));
                c.setStartDate(rs.getString("start_date"));
                c.setProgress(rs.getInt("progress"));
                c.setStatus(rs.getString("status"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Course getById(int id) {
        Course c = null;
        String sql = "SELECT * FROM courses WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = new Course();
                c.setId(rs.getInt("id"));
                c.setStudentId(rs.getInt("student_id"));
                c.setCourseName(rs.getString("course_name"));
                c.setDuration(rs.getString("duration"));
                c.setStartDate(rs.getString("start_date"));
                c.setProgress(rs.getInt("progress"));
                c.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public boolean updateCourse(Course c) {
        boolean status = false;
        String sql = "UPDATE courses SET course_name=?, duration=?, start_date=?, progress=?, status=? WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, c.getCourseName());
            ps.setString(2, c.getDuration());
            ps.setString(3, c.getStartDate());
            ps.setInt(4, c.getProgress());
            ps.setString(5, c.getStatus());
            ps.setInt(6, c.getId());

            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public boolean deleteCourse(int id) {
        boolean status = false;
        String sql = "DELETE FROM courses WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
