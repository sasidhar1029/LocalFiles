package com.vcube.controller;

import java.io.IOException;
import java.util.List;

import com.vcube.dao.CourseDAO;
import com.vcube.dto.Course;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminCourses")
public class AdminCoursesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        // 🔐 Session check
        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // 🔐 Admin check
        String username = (String) session.getAttribute("username");
        if (!"admin".equals(username)) {
            response.sendRedirect("dashboard.jsp");
            return;
        }

        CourseDAO dao = new CourseDAO();
        List<Course> courses = dao.getAllCourses();

        request.setAttribute("courses", courses);
        RequestDispatcher rd = request.getRequestDispatcher("adminCourses.jsp");
        rd.forward(request, response);
    }
}
