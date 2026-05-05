package com.sms.controller;

import com.sms.dao.CourseDAO;
import com.sms.dto.Course;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        Integer studentId = (Integer) session.getAttribute("studentId");
        if (studentId == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        String action = req.getParameter("action");
        if (action == null) action = "list";

        CourseDAO dao = new CourseDAO();

        switch (action) {
            case "addForm":
                req.getRequestDispatcher("add-course.jsp").forward(req, resp);
                break;

            case "editForm":
                int id = Integer.parseInt(req.getParameter("id"));
                Course c = dao.getById(id);
                req.setAttribute("course", c);
                req.getRequestDispatcher("edit-course.jsp").forward(req, resp);
                break;

            case "delete":
                int delId = Integer.parseInt(req.getParameter("id"));
                dao.deleteCourse(delId);
                resp.sendRedirect("courses");
                break;

            default: // list
                List<Course> list = dao.getCoursesByStudent(studentId);
                req.setAttribute("courses", list);
                req.getRequestDispatcher("courses.jsp").forward(req, resp);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        Integer studentId = (Integer) session.getAttribute("studentId");
        if (studentId == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        String action = req.getParameter("action");
        CourseDAO dao = new CourseDAO();

        if ("add".equals(action)) {
            Course c = new Course();
            c.setStudentId(studentId);
            c.setCourseName(req.getParameter("courseName"));
            c.setDuration(req.getParameter("duration"));
            c.setStartDate(req.getParameter("startDate"));
            c.setProgress(Integer.parseInt(req.getParameter("progress")));
            c.setStatus(req.getParameter("status"));

            dao.addCourse(c);
            resp.sendRedirect("courses");

        } else if ("update".equals(action)) {
            Course c = new Course();
            c.setId(Integer.parseInt(req.getParameter("id")));
            c.setCourseName(req.getParameter("courseName"));
            c.setDuration(req.getParameter("duration"));
            c.setStartDate(req.getParameter("startDate"));
            c.setProgress(Integer.parseInt(req.getParameter("progress")));
            c.setStatus(req.getParameter("status"));

            dao.updateCourse(c);
            resp.sendRedirect("courses");
        }
    }
}
