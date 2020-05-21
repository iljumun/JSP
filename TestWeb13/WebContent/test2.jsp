<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	for(int inx=0; inx < 10; inx++ ){
		out.print(inx + "<br>");
	}
%>

<% 
	for(int inx=0; inx < 10; inx++ ){ %>
		<%= inx %> <br> <% } %>

</body>
</html>