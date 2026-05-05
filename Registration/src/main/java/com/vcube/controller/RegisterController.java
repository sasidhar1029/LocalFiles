package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.Student;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        // 🔹 Read form data
        String fullname = req.getParameter("fullname");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Student s = new Student(fullname, username, password);
        StudentDAO dao = new StudentDAO();

        // 🔹 Call DAO & store result
        String result = dao.register(s);

        // 🔹 Redirect based on result
        if ("success".equals(result)) {
            res.sendRedirect("login.jsp?msg=registered");
        } else if ("exists".equals(result)) {
            res.sendRedirect("register.jsp?error=exists");
        } else {
            res.sendRedirect("register.jsp?error=failed");
        }
    }
}
