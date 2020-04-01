package com.capgemini.empwebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dto.EmployeeBeen;
import com.capgemini.empwebapp.factory.EmployeeDAOFactory;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
		EmployeeBeen bean = dao.auth(email, password);
		
		if (bean==null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.forward(req, resp);
		} else {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			RequestDispatcher dispatcher=req.getRequestDispatcher("home");
			dispatcher.forward(req, resp);
		}
		
	}

}
