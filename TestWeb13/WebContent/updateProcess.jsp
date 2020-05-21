<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%	
	String dept_id = request.getParameter("dept_id");
	String dept_name = request.getParameter("dept_name");
	String loc_id = request.getParameter("loc_id");

	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection con = DriverManager.getConnection(url, "scott","tiger");
	
	String strSql = "UPDATE DEPT SET DEPT_NAME=?, LOC_ID=? WHERE DEPT_ID = ?";
	PreparedStatement stmt = con.prepareStatement(strSql);
	stmt.setString(1, dept_name);
	stmt.setInt(2, Integer.parseInt(loc_id)); 
 	stmt.setInt(3, Integer.parseInt(dept_id));
	stmt.executeUpdate();
	//out.print("Save item");
	stmt.close();
	response.sendRedirect("list.jsp");
	
%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UDATE</title>
</head>
<body>

</body>
</html>