package com.capgemini.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.webapp.dto.User;

public class MyFirstServlet  extends HttpServlet {
	public MyFirstServlet() {
		System.out.println("object of MyFirstServlet method");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init method");
	}
	@Override
	public void destroy() {
		System.out.println("destroy method");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String empName = config.getInitParameter("name");
		
		ServletContext context = getServletContext();
		String company = context.getInitParameter("company");
		
		context.setAttribute("obj",new Object());
		
		User user = new User();
		user.setId(1);
		user.setName("Prashanth");
		user.setEmail("prashanth@capgemini.com");
		context.setAttribute("user", user);
		
		Object obj = req.getAttribute("obj1");
		
		System.out.println("doGet Method");
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		
		
		  resp.setContentType("text/html");
		  PrintWriter out = resp.getWriter();
		  
		  out.println("<html>"); 
		  out.println("<body>");
		  Date date = new Date();
		  
		  out.println("<h1 style='color:black'>");
		  out.println(date);
		  out.println("</h>");
		  
		  out.println("<h1 style='color:blue'>");
		  out.println(name);
		  out.println("</h>");
		  
		  
		  out.println("<h1  style='color:red'>");
		  out.println(age);
		  out.println("</h>");
		  
		  out.println("<h1  style='color:blue'>");
		  out.println(empName);
		  out.println("</h>");
		  
		  out.println("<h1  style='color:red'>");
		  out.println(company);
		  out.println("</h>");
		  
		  out.println("<h1 style='color:black'> Request attr: ");
		  out.println(obj);
		  out.println("</h>");
		  
		  out.println("</body>");
		  out.println("</html>");
		 
	}
	

}
