package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;
@WebServlet("/Login")
public class Login extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws HTTPException, IOException{
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		Cookie[] c = req.getCookies();
		if(c != null) {
			//out.print(c[0].getName() + "," + c[0].getValue());
			if(c[0].getValue().equals("Y")) {
				out.print("Logined");
				
			}else {
				out.print("<html><body>");
				out.print("<form action='LoginProcess3' method ='get'>");
				out.print("아이디<input type='text' name='userId'><br>");
			    out.print("비밀번호<input type='password' name='userPwd'><br>");
			    out.print("<input type='submit' value='Login'<br>");
				out.print("</form>");
				out.print("</body></html>");
				out.close();
			}
				
		
		} else {
			out.print("<html><body>");
			out.print("<form action='LoginProcess3' method ='get'>");
			out.print("아이디<input type='text' name='userId'><br>");
		    out.print("비밀번호<input type='password' name='userPwd'><br>");
		    out.print("<input type='checkbox' name='state'> 로그인 상태 유지<br>");
		    out.print("<input type='submit' value='Login'<br>");;
			out.print("</form>");
			out.print("</body></html>");
			out.close();
		}
		out.print("<html><body>");
		out.print("<form action='LoginProcess3' method ='get'>");
		out.print("아이디<input type='text' name='userId'><br>");
	    out.print("비밀번호<input type='password' name='userPwd'><br>");
	    out.print("<input type='submit' value='Login'<br>");
		out.print("</form>");
		out.print("</body></html>");
		out.close();
		
	}
}