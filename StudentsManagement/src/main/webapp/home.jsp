<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<p>welcome to home page :<%= session.getAttribute("username") %></p>
		<a href="contact.jsp">contact page</a>
	</body>
</html>