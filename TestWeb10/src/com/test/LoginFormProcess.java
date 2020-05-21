package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginFormProcess")
public class LoginFormProcess extends HttpServlet{
	protected void doGet(HttpServletRequest req, 
				HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("LoginFormProcess<br>");
		out.println("Login....<br>");

		String userName = req.getParameter("userName");
		String userPwd = req.getParameter("userPwd");
		if(userName.equals("홍길동") && userPwd.equals("1234")) {
			out.print(userName + "<b>님 환영합니다.");
		} else {
			out.print("<b>이름과 비밀번호를 확인해 주세요.");
		}
		out.close();
	}
}
