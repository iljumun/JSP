package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LocalTestServlet")
public class LocalTestServlet extends HttpServlet{
	int number=0;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		while(number++ < 100) {
			out.print(number + "<br>");
			out.flush();
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.close();
	}
}
