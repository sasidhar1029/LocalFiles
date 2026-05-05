package com.sms.controller;

import com.sms.dao.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/forgot-password")
public class ForgotPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String newPass = req.getParameter("newpassword");
        String confirm = req.getParameter("confirmpassword");

        if (newPass == null || !newPass.equals(confirm)) {
            resp.sendRedirect("forgot-password.jsp?error=nomatch");
            return;
        }

        StudentDAO dao = new StudentDAO();
        boolean ok = dao.updatePassword(username, newPass);

        if (ok) {
            resp.sendRedirect("login.jsp?msg=updated");
        } else {
            resp.sendRedirect("forgot-password.jsp?error=usernotfound");
        }
    }
}
