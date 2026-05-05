package com.project.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.project.dao.StudentDAO;
import com.project.dto.Student;

@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double marks = Double.parseDouble(req.getParameter("marks"));
        String dept = req.getParameter("dept");

        StudentDAO dao = new StudentDAO();
        dao.addStudent(new Student(id, name, marks, dept));
        res.sendRedirect("view.jsp?msg=added");
    }
}
