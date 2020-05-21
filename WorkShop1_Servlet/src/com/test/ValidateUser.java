package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;
@WebServlet("/ValidateUser")	
public class ValidateUser extends HttpServlet {
	
private boolean userExists(String userid, String userPwd) {
		if(userid.equals("홍길동") && userPwd.equals("1234")) {
			return true;
		}
		else { return false; }
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws HTTPException,IOException {
		res.setContentType("text/html;charset=utf-8");
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		PrintWriter out = res.getWriter();
		
		boolean loginFlag = this.userExists(userId, userPwd);
		
		if(loginFlag) {
			res.sendRedirect("Welcome");
		} else {
			out.print("<body><html>");
			out.print("<script> alert('아이디와 비밀번호를 확인해 주세요.');");
			out.print("window.location.href = \"http://localhost/WorkShop1_Servlet/LoginForm.html\";");
			out.print("</script></body></html>");
		}
		/*if(userExists(userId, userPwd) == true) {
			res.sendRedirect("Welcome");
		}
		else {
			out.print("<body><html>");
			out.print("<script> alert('아이디와 비밀번호를 확인해 주세요.');");
			out.print("window.location.href = \"http://localhost/WorkShop1_Servlet/LoginForm.html\";");
			out.print("</script></body></html>");
			
		}*/
	}
	
	public void doGet(HttpServletResponse res, HttpServletRequest req) throws HTTPException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("<body><html>");
		out.print("<script> alert('잘못된 접근입니다.');");
		out.print("window.location.href = \"http://localhost/WorkShop1_Servlet/LoginForm.html\";");
		out.print("</script></body></html>");
	}
}
