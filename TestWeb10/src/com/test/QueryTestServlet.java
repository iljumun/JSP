package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		
		out.print("ID : " + id + "<br/>");
		out.print("비밀번호 : " + password + "<br/>");
		out.print("이름 : " + name + "<br/>");
		out.print("취미");
		for(int i=0; i < hobbies.length; i++) {
			out.print(hobbies[i] + "\n");	
		}
		out.print("<br/>");
		out.print("성별 : " + gender + "<br/>");
		out.print("종교 : " + religion + "<br/>");
		out.print("소개 : " + intro + "<br/>");
		out.print("전체 질의 문자열 : " + req.getQueryString());
		
		out.print("</body></html>");
		out.close();
	}
}
