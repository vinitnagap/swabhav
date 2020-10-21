<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = 10;
	if (num % 2 == 0) {
		out.print(num + " is Even");
	} else
		out.print(num + " is Odd");
	%>
</body>
</html>