<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	h1{
	background-color: green;}
</style>
<meta charset="ISO-8859-1">
<title>Creating Cookies</title>
</head>
<body>
	<%
		Cookie color = new Cookie("color","green");
		color.setMaxAge(24*60*60);
		response.addCookie(color);
	%>
	<a href="getCookies.jsp">Check</a>

</body>
</html>