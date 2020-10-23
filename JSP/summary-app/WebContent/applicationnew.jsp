<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%!int oldCount = 0, newCount = 1;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session</title>
</head>
<body>
	<%
		application.setAttribute("counter", oldCount);
	out.print("Old = " + oldCount);
	out.print("<br>New = " + newCount);
	oldCount++;
	newCount++;
	%>
</body>
</html>