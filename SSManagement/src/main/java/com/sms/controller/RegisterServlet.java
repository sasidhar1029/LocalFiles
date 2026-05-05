package com.sms.controller;

import com.sms.dao.StudentDAO;
import com.sms.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String fullname = req.getParameter("fullname");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");

        Student s = new Student();
        s.setFullname(fullname);
        s.setUsername(username);
        s.setPassword(password);
        s.setEmail(email);
        s.setMobile(mobile);

        StudentDAO dao = new StudentDAO();
        boolean ok = dao.register(s);

        if (ok) {
            resp.sendRedirect("login.jsp?msg=registered");
        } else {
            resp.sendRedirect("register.jsp?error=1");
        }
    }
}
