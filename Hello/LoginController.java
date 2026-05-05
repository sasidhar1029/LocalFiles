package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAo;
import com.vcube.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	public LoginController() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
		String username =request.getParameter("username");
		String password = request.getParameter("password");
		Student sd = new Student();
		sd.setUsername(username);
		sd.setPassword(password);
		StudentDAo s= new StudentDAo();
		String status =s.insertStudents(sd);
		if (status.equals("success")) {
//			request.setAttribute("username", username);
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

			rd.forward(request, response);
		}	

	}

}
