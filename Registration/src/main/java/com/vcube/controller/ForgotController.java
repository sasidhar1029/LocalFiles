package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.dto.UpasswordDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ForgotServlet")
public class ForgotController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String newPassword = request.getParameter("newpassword");
        String confirmPassword = request.getParameter("confirmpassword");

        // ❌ Password mismatch
        if (!newPassword.equals(confirmPassword)) {
            response.sendRedirect("Forgot.jsp?error=nomatch");
            return;
        }

        // ✅ Create DTO
        UpasswordDto dto = new UpasswordDto();
        dto.setUsername(username);
        dto.setNewPassword(newPassword);

        StudentDAO dao = new StudentDAO();
        String result = dao.updateStudent(dto);

        // ❌ User not found
        if ("failure".equals(result)) {
            response.sendRedirect("Forgot.jsp?error=notfound");
        }
        // ✅ Success
        else {
            response.sendRedirect("login.jsp?msg=updated");
        }
    }
}
