package com.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/h1")
public class Mycon extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//
//		String id = request.getParameter("id");
//		String sname = request.getParameter("sname");
//		String branch = request.getParameter("branch");
//		String marks = request.getParameter("marks");
//		System.out.println(id + ":" + sname + ":" + branch + ":" + marks);
		System.out.println("Hello....");
		RequestDispatcher rd = request.getRequestDispatcher("output.html");
		rd.forward(request, response);
	}
}
