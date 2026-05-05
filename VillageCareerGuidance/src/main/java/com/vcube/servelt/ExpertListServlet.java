package com.vcube.servelt;

import java.io.IOException;
import java.util.List;

import com.vcube.dao.ExpertDAO;
import com.vcube.model.Expert;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/experts")
public class ExpertListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ExpertDAO dao = new ExpertDAO();
		List<Expert> experts = dao.getAllExperts();
		request.setAttribute("experts", experts);
		request.getRequestDispatcher("/experts.jsp").forward(request, response);
	}
}