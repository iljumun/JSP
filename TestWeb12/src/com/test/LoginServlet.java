package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(name.equals("홍길동") && password.equals("1234")) {
			out.print("Welcom, " + name );
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("password", password);
		} else {
			out.print("Get out here.");
			request.getRequestDispatcher("login2.html").include(request, response);
		}
		
	}
	

}
