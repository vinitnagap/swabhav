<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application</title>
</head>
<body>
	<%
		int count;
	if (application.getAttribute("counter") == null) {
		count = 0;
	} else
		count = (int) application.getAttribute("counter");
	int oldCount = count;
	count++;
	application.setAttribute("counter", count);
	out.print("Old = " + oldCount);
	out.print("<br>New = " + count);
	%>
	<div>
		<a href="summary.jsp">Summary</a>
	</div>
</body>
</html>