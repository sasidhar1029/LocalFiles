package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 🔐 Session check
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // 🔐 Username must come from session (NOT from form)
        String username = (String) session.getAttribute("username");

        Student s = new Student();
        s.setFullname(request.getParameter("fullname"));
        s.setUsername(username);
        s.setEmail(request.getParameter("email"));
        s.setMobile(request.getParameter("mobile"));
        s.setCourse(request.getParameter("course"));
        s.setJoined(request.getParameter("joined"));
        s.setStatus(request.getParameter("status"));

        StudentDAO dao = new StudentDAO();
        boolean updated = dao.updateProfile(s);

        if (updated) {
            response.sendRedirect("profile.jsp?msg=success");
        } else {
            response.sendRedirect("profile.jsp?msg=error");
        }
    }
}
