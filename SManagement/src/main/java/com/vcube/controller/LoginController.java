package com.vcube.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.Login;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Login l = new Login(username, password);
        StudentDAO dao = new StudentDAO();
        String result = dao.validateStudent(l);

        if ("success".equals(result)) {
            request.setAttribute("username", username);
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        } else {
            response.getWriter().println("Invalid login!");
        }
    }
}
