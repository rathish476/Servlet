package com.pitch.CarSales;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pitch.carDAO.CarSalesUserDao;
import com.pitch.carDAOImpl.CarSalesDaoImpl;


public class RegisterPage extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 712482055694921868L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside RegisterPageServlet");
		
		String NameStr = req.getParameter("Name");
		String emailIdStr = req.getParameter("emailid");
		String ContactNumberStr = req.getParameter("Contact Number");
		String passwordStr = req.getParameter("password");
		String repasswordStr = req.getParameter("re-password");
		
		System.out.println("First name entered in web client: "+ NameStr);
		System.out.println("emailid entered in web client: "+emailIdStr);
		System.out.println("ContactNumber entered in web client: "+ContactNumberStr);
		System.out.println("password entered in web client: "+passwordStr);
		System.out.println("repassword entered in web client: "+repasswordStr);
		
		String outputHtml = null;
		
		// check if record exist in DB
		 //select count * userdb from  where emailId= emailIdStr;
		CarSalesUserDao dao = new CarSalesDaoImpl();
		
		
		if(emailIdStr.equals("rathishxworkz@gmail.com")) { 
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("successful.html"); 
			requestDispatcher.forward(req, resp);
			
		}else {
			dao.save(); //--> insert into table
			
			   outputHtml = "<html>" + "<body>" + "<h1>"
			 +" Congragulations you are successfully registered"
			  +" <a href='login'>Click here to login</a>" + "</h1>" + "</body>" +
			  "</html>"; 
			   PrintWriter out = resp.getWriter(); out.write(outputHtml);
			 
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login");
			requestDispatcher.forward(req, resp);
		}
		
		
		
	}

}