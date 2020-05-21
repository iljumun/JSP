package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TwoServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Servlet is destoryed");
	
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Servlet is initialized");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.println("<html><body>");
		out.println("<b>Hello World, TwoServlet");
		out.println("</html></body>");
		System.out.println("Servlet is serviced");
	}
	
}
