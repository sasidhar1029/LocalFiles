package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.Login;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        // 📥 Read form data
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // DTO
        Login login = new Login(username, password);

        // DAO
        StudentDAO dao = new StudentDAO();
        String result = dao.login(login);

        if ("success".equals(result)) {

            // 🔐 Create session
            HttpSession session = req.getSession(true);
            session.setAttribute("username", username);

            // 👮 Admin vs Student redirect
            if ("admin".equalsIgnoreCase(username)) {
                res.sendRedirect("adminDashboard.jsp");
            } else {
                res.sendRedirect("home.jsp");
            }

        } else {
            // ❌ Invalid login
            res.sendRedirect("login.jsp?error=invalid");
        }
    }
}
