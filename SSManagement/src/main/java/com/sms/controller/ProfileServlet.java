package com.sms.controller;

import com.sms.dao.StudentDAO;
import com.sms.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        Integer id = (Integer) session.getAttribute("studentId");
        if (id == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        StudentDAO dao = new StudentDAO();
        Student s = dao.getById(id);
        req.setAttribute("student", s);
        req.getRequestDispatcher("profile.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        Integer id = (Integer) session.getAttribute("studentId");
        if (id == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");

        Student s = new Student();
        s.setId(id);
        s.setFullname(fullname);
        s.setEmail(email);
        s.setMobile(mobile);

        StudentDAO dao = new StudentDAO();
        boolean ok = dao.updateProfile(s);

        if (ok) {
            session.setAttribute("fullname", fullname);
            resp.sendRedirect("profile?msg=updated");
        } else {
            resp.sendRedirect("profile?error=1");
        }
    }
}
