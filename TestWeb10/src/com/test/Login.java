package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html"); // html 타입으로 인식
		PrintWriter out = res.getWriter(); //프린트 기능
		out.println("<html><body>");
		out.println("id : ");
		out.println("<input type = text name = userId><br>");
		out.println("password : ");
		out.println("<input type = password name = userPwd><br>");
		out.println("<input type = button value='Login'>,<br>");
		out.println("</html></body>");
			
	}

}
