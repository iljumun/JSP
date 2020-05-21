<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.dao.*" %>
<%@ page import="com.test.beans.*" %>
<%@ page import="java.util.*" %>
<% 
List<Register> list = RegisterDao2.getAllRecords();
for(Register r : list){
	out.print(r.getName() + "<br>");
}
/* for(int inx=0; inx < list.size(); inx++){
	
} */
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>