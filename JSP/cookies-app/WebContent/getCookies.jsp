<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checking Cookie</title>
</head>
<body>
	<%
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				if (cookie.getName().equals("color")) {
					out.print("<h1>" + "Cookie Found Successfully" + "</h1>");
	%>

	<body style="background-color: <%=cookie.getValue()%>"></body>
	<%	
				}
			}
		} else {
			out.print("<h1>" + "Cookies not found" + "</h1>");
		}
	%>

</body>
</html>