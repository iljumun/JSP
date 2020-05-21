<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection con = DriverManager.getConnection(url, "scott","tiger");
	Statement stmt = con.createStatement();
	/* String strSql = "create table test10(id varchar2(5))";
	stmt.executeUpdate(strSql);
	stmt.close(); */
	
	String strSql2 = "SELECT * FROM DEPT";
	ResultSet rs = stmt.executeQuery(strSql2);
%>

<%
	while(rs.next()){
		out.print(rs.getInt("DEPT_ID") + "," + rs.getString("DEPT_NAME") + "<br>");
	}


	con.close();
	//out.print("Created tabletest10");
	
%>
</body>
</html>