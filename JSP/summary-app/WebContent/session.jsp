<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session</title>
</head>
<body>
	<%
		int count;
	if (session.getAttribute("counter") == null) {
		count = 0;
	} else
		count = (int) session.getAttribute("counter");
	int oldCount = count;
	count++;
	session.setAttribute("counter", count);
	out.print("Old = " + oldCount);
	out.print("<br>New = " + count);
	out.print("<br>ID : " + session.getId());
	%>
	<div>
		<a href="summary.jsp">Summary</a>
	</div>
</body>
</html>