package com.pitch.CarSales;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello there I'm in Servlet");
		
		String htmlcontent = "<html> "
				+ "<body> "
				+ "<h3> Welcome to Car Sales</h3>"  
				+ "<h3>Find your Beast </h3>"
				+ "</body>"
				+ "</html>";
	
		PrintWriter out = resp.getWriter();
		out.write(htmlcontent);
		
	}
	
	
}