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
		int choice = 2;
	switch (choice) {
	case 1:
		out.print("Play Cricket");
		break;
	case 2:
		out.print("Play Football");
		break;
	default:
		out.print("Do Nothing");
		break;
	}
	%>
</body>
</html>