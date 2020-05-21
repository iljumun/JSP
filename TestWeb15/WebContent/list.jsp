<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ page import="com.test.beans.*" %>
<%@ page import="com.test.dao.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<table border="1" style="border-collapse:collapse;border:1px gray solid;">
		<tr>
			<td>ID</td><td>이름</td><td>비밀번호</td><td>성별</td><td>이메일</td><td>출신</td>
		</tr>
	<% 
		List<Register> list = RegisterDao.getAllRecords();
		for(Register r : list){ 
	%>
		<tr>
			<td><%=r.getId() %></td>
			<td><a href="view.jsp?id=<%=r.getId()%>"><%=r.getName()%></td>
			<td><%=r.getPassword() %></td>
			<td><%=r.getSex() %></td>
			<td><%=r.getEmail() %></td>
			<td><%=r.getCountry() %></td>
		
		</tr>
	
	<%
		} 
	%>
	</table>
	
</body>
</html>