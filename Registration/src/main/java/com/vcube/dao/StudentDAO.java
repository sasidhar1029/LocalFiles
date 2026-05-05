package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vcube.dto.Login;
import com.vcube.dto.Student;
import com.vcube.dto.UpasswordDto;
import com.vcube.utility.DBConnection;

public class StudentDAO implements StudentDAOInterface {

	// ✅ REGISTER
	@Override
	public String register(Student s) {

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement check = con.prepareStatement("SELECT username FROM students WHERE username=?");
			check.setString(1, s.getUsername());
			ResultSet rs = check.executeQuery();

			if (rs.next()) {
				return "exists";
			}

			PreparedStatement ps = con
					.prepareStatement("INSERT INTO students(fullname, username, password) VALUES(?,?,?)");
			ps.setString(1, s.getFullname());
			ps.setString(2, s.getUsername());
			ps.setString(3, s.getPassword());

			ps.executeUpdate();
			return "success";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failure";
	}

	// ✅ LOGIN
	@Override
	public String login(Login login) {

		String sql = "SELECT * FROM students WHERE username=? AND password=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return "success";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "fail";
	}

	// ✅ ADMIN – VIEW ALL STUDENTS
	@Override
	public List<Student> getAllStudents() {

		List<Student> list = new ArrayList<>();

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement ps = con.prepareStatement("SELECT fullname, username FROM students");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student s = new Student();
				s.setFullname(rs.getString("fullname"));
				s.setUsername(rs.getString("username"));
				list.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// ✅ FORGOT PASSWORD
	@Override

	// ✅ Forgot Password / Update Password
	public String updateStudent(UpasswordDto u) {

		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("UPDATE students SET password=? WHERE username=?")) {

			ps.setString(1, u.getNewPassword());
			ps.setString(2, u.getUsername());

			return ps.executeUpdate() > 0 ? "success" : "failure";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failure";
	}

	// ✅ UPDATE PROFILE
	@Override
	public boolean updateProfile(Student s) {

		boolean status = false;

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement ps = con
					.prepareStatement("UPDATE students SET fullname=?, email=?, mobile=?, course=?, joined=?, status=? "
							+ "WHERE username=?");

			ps.setString(1, s.getFullname());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getMobile());
			ps.setString(4, s.getCourse());
			ps.setString(5, s.getJoined());
			ps.setString(6, s.getStatus());
			ps.setString(7, s.getUsername());

			status = ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	// ✅ GET STUDENT BY USERNAME (PROFILE PAGE)
	@Override
	public Student getStudentByUsername(String username) {

		Student s = null;

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE username=?");
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				s = new Student();
				s.setFullname(rs.getString("fullname"));
				s.setUsername(rs.getString("username"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getString("mobile"));
				s.setCourse(rs.getString("course"));
				s.setJoined(rs.getString("joined"));
				s.setStatus(rs.getString("status"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
}
