<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%		
		/* Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:company";
		Connection con = DriverManager.getConnection(url, "scott","tiger"); */
		String dept_id = request.getParameter("dept_id");
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
		Connection con = ds.getConnection();
		String strSql = "SELECT * FROM DEPT WHERE DEPT_ID = ?";
		PreparedStatement stmt = con.prepareStatement(strSql);
		stmt.setString(1, dept_id);
		ResultSet rs =  stmt.executeQuery();
		String dept_name = ""; 
		String loc_id = "";
		while(rs.next()){
			dept_name = rs.getString("dept_name");
			loc_id = rs.getString("loc_id");
		}
		rs.close();
		stmt.close();
		con.close();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEPT UPDATE</title>
</head>
<body>


<form action="updateProcess.jsp" method="get">
부서번호 : <input type="text" name="dept_id" value="<%=dept_id%>"><br>
부서명 : <input type="text" name="dept_name" value="<%=dept_name%>"><br>
위치코드 : <input type="text" name="loc_id" value="<%=loc_id%>"><br>
<input type="submit" value="저장">
<input type="reset" value="초기화">
</form>
</body>
</html>