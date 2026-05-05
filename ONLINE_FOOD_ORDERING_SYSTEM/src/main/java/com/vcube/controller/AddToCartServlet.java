package com.vcube.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

import com.vcube.model.CartItem;

public class AddToCartServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession session = req.getSession();
		List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

		if (cart == null)
			cart = new ArrayList<>();

		CartItem c = new CartItem();
		c.foodId = Integer.parseInt(req.getParameter("id"));
		c.name = req.getParameter("name");
		c.price = Double.parseDouble(req.getParameter("price"));
		c.qty = Integer.parseInt(req.getParameter("qty"));

		cart.add(c);
		session.setAttribute("cart", cart);
		res.sendRedirect("cart.jsp");
	}
}
