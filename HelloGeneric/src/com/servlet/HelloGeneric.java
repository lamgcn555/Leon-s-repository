package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloGeneric extends GenericServlet {
	
	/**
	 * The service method 
	 * 
	 * The method is called by the servlet container to allow the servlet to respond to a request.
	 * 
	 * @author Leon
	 * @param req - the ServletRequest object that contains the client's request
	 * @param res - the ServletResponse object that will contain the servlet's response 
	 * @throws ServletException - if an exception occurs that interferes with the servlet's normal operation occurred
	 * @throws IOException - if an input or output exception occurs
	 */
	public  void service(ServletRequest req,ServletResponse res)
			throws ServletException,IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hello World Generic");
	}
}
