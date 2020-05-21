<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// DB설정
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	// DB id, password 연결하기 위해서는 java.sql.* 임포트 해줘야함
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	
	Statement stmt = conn.createStatement();
	//sql 쿼리문장 저장
	String strSql = "SELECT * FROM DEPT ORDER BY DEPT_ID DESC";
	
	//sql 쿼리문장 실행
	ResultSet rs = stmt.executeQuery(strSql);
%>    

	<%
		while(rs.next()){
			out.print(rs.getString("DEPT_ID"));
		}
	%>
</body>
</html>