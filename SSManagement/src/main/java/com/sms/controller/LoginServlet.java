package com.sms.controller;

import com.sms.dao.StudentDAO;
import com.sms.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        StudentDAO dao = new StudentDAO();
        Student s = dao.login(username, password);

        if (s != null) {
            HttpSession session = req.getSession();
            session.setAttribute("studentId", s.getId());
            session.setAttribute("username", s.getUsername());
            session.setAttribute("fullname", s.getFullname());
            resp.sendRedirect("home.jsp");
        } else {
            resp.sendRedirect("login.jsp?error=1");
        }
    }
}
