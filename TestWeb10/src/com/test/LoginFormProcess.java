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
		if(userName.equals("ȫ�浿") && userPwd.equals("1234")) {
			out.print(userName + "<b>�� ȯ���մϴ�.");
		} else {
			out.print("<b>�̸��� ��й�ȣ�� Ȯ���� �ּ���.");
		}
		out.close();
	}
}
