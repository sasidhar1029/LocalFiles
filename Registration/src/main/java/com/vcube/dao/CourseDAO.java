package com.vcube.dao;

import java.sql.*;
import java.util.*;
import com.vcube.dto.Course;
import com.vcube.utility.DBConnection;

public class CourseDAO {

	// ✅ ADD COURSE
	public boolean addCourse(Course c) {

		String sql = "INSERT INTO courses(username, course_name, duration, start_date, progress, status) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, c.getUsername());
			ps.setString(2, c.getCourseName());
			ps.setString(3, c.getDuration());
			ps.setString(4, c.getStartDate());
			ps.setInt(5, c.getProgress());
			ps.setString(6, c.getStatus());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// ✅ STUDENT: READ COURSES BY USERNAME
	public List<Course> getCourses(String username) {

		List<Course> list = new ArrayList<>();

		String sql = "SELECT course_name, duration, start_date, progress, status "
				+ "FROM courses WHERE username=? ORDER BY start_date DESC";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Course c = new Course();
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

	// ✅ ADMIN: READ ALL COURSES
	public List<Course> getAllCourses() {

		List<Course> list = new ArrayList<>();

		String sql = "SELECT username, course_name, duration, start_date, progress, status "
				+ "FROM courses ORDER BY start_date DESC";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Course c = new Course();
				c.setUsername(rs.getString("username"));
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
}
