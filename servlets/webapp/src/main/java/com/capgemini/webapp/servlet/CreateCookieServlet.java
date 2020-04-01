package com.capgemini.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/create-cookie")
public class CreateCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie cookie = new Cookie("Hero", "Nani");
	Cookie cookie1 = new Cookie("Heroien", "SAMANTHA");
	resp.addCookie(cookie);
	resp.addCookie(cookie1);
	PrintWriter out = resp.getWriter();
	out.println("<html><body><h1>");
	out.println("Cookie added");
	out.println("</h1></body></html>");
	}
}
