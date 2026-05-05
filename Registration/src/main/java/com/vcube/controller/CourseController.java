package com.vcube.controller;
import java.io.IOException;

import com.vcube.dao.CourseDAO;
import com.vcube.dto.Course;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CourseController")
public class CourseController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
			return;
		}

		// ✅ Username MUST come from session
		String username = (String) session.getAttribute("username");

		Course c = new Course();
		c.setUsername(username); // ⭐ FIX
		c.setCourseName(request.getParameter("courseName"));
		c.setDuration(request.getParameter("duration"));
		c.setStartDate(request.getParameter("startDate"));
		c.setProgress(Integer.parseInt(request.getParameter("progress")));
		c.setStatus(request.getParameter("status"));

		CourseDAO dao = new CourseDAO();
		dao.addCourse(c);

		response.sendRedirect("course.jsp");
	}
}
