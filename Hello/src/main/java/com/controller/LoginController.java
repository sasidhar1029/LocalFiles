package com.controller;

import java.io.IOException;

import com.vcube.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello....");
		//id comes as a string format from front end that's why we convert int to string
		int id = Integer.parseInt(request.getParameter("id"));
		String sname = request.getParameter("sname");
		int marks = Integer.parseInt(request.getParameter("marks"));
		String branch = request.getParameter("branch");
		System.out.println(id + ":" + sname + ":" + marks + ":" +branch);
		Student s = new Student();
		s.setId(id);
		s.setSname(sname);
		s.setMarks(marks);
		s.setBranch(branch);

		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}

}
