package com.vcube.controller;

import java.io.IOException;
import java.util.List;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewStudents")
public class ViewStudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        // 🔐 Login check
        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // 🔐 Admin check
        String username = (String) session.getAttribute("username");
        if (!"admin".equalsIgnoreCase(username)) {
            response.sendRedirect("dashboard.jsp");
            return;
        }

        // ✅ Use DAO object (NOT static)
        StudentDAO dao = new StudentDAO();
        List<Student> students = dao.getAllStudents();

        request.setAttribute("students", students);

        RequestDispatcher rd = request.getRequestDispatcher("viewStudents.jsp");
        rd.forward(request, response);
    }
}
