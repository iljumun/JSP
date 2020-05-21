package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LoginProcess3")
public class LoginProcess3 extends HttpServlet{
   
   private boolean ValidateUser(String userId,String userPwd) {
      if(userId.equals("홍길동") && userPwd.equals("1234")) {
         return true;
      }
      else {
         return false;
      }
   }
   
   protected void doGet(HttpServletRequest req, 
         HttpServletResponse res) throws IOException ,ServletException{
      String userId = req.getParameter("userId");
      String userPwd = req.getParameter("userPwd");
      String checkbox = req.getParameter("state");
      
      res.setContentType("text/html;charset=utf-8");
      PrintWriter out = res.getWriter();
      out.print("<html><body>");
      out.print(checkbox);
      boolean loginFlag= ValidateUser(userId, userPwd);
      if(checkbox != null) {
    	  if(loginFlag) { 
    	         Cookie c = new Cookie("loginCheck","Y");
    	         c.setPath("/");
    	         res.addCookie(c);
    	         out.print("Login successful");
// 				 Cookie[] cs = req.getCookies();
//    	         for(int i =0; i<cs.length;i++) {
//    	               out.print(cs[i].getName() +","+cs[i].getValue());
//    	         }
    	      }
    	      else {
    	         out.print("Login error : ");
    	         out.print("<a href='Login'>Go to login</a>");
    	      }  
      } else {
    	  if(loginFlag) { 
 	         Cookie c = new Cookie("loginCheck","Y");
 	         c.setPath("/");
 	         res.addCookie(c);
 	         out.print("Login successful");
 	         out.print("<a href='Login'>Go to login</a>");
 	        Cookie[] cs = req.getCookies();
// 	         for(int i =0; i<cs.length;i++) {
// 	               out.print(cs[i].getName() +","+cs[i].getValue());
// 	         }
 	      }
 	      else {
 	         //out.print("<script>alert('로그인이 실패했습니다. 아이디 패스워드를 확인해주세요');history.back(-1);</script>");
// 	         out.print("<script>document.location.replace('http://10.10.14.124/TestWeb11/login.html'); </script>");
 	         out.print("Login error : ");
 	         out.print("<a href='Login'>Go to login</a>");
 	      } 
      }
      
      out.print("</body></html>");
      out.close();
   }
}