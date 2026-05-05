package com.vcube.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.dao.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				HttpSession session = req.getSession();
				session.setAttribute("uid", rs.getInt("user_id"));
				session.setAttribute("role", rs.getString("role"));

				if ("ADMIN".equals(rs.getString("role")))
					res.sendRedirect("admin_add_food.jsp");
				else
					res.sendRedirect("menu.jsp");
			} else {
				res.getWriter().print("Invalid Login");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
