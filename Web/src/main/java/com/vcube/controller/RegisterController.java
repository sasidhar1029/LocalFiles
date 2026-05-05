package com.vcube.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.Student;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullname = request.getParameter("fullname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Student s = new Student(fullname, username, password, password);
        StudentDAO dao = new StudentDAO();
        String result = dao.register(s);

        if ("success".equals(result)) {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        } else {
            response.getWriter().println("Registration failed.");
        }
    }
}
