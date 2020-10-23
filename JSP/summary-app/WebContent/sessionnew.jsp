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
		int oldCount,newCount;
	if (session.getAttribute("counter") == null) {
		oldCount = 0;
		newCount = 1;
	} else
		oldCount = (int) session.getAttribute("counter");
	newCount = oldCount + 1;
	out.print("Old = " + oldCount);
	out.print("<br>New = " + newCount);
	out.print("<br>ID : " + session.getId());
	session.setAttribute("counter", newCount);
	%>
	<div>
		<a href="summary.jsp">Summary</a>
	</div>
</body>
</html>