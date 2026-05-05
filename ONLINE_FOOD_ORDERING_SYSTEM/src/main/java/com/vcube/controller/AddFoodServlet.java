package com.vcube.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

import com.vcube.dao.FoodDAO;

public class AddFoodServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			FoodDAO.addFood(req.getParameter("name"), Double.parseDouble(req.getParameter("price")));
			res.sendRedirect("admin_add_food.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
