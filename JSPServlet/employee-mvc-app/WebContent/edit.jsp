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
		String setName = (String) request.getAttribute("name");
	String setRole = (String) request.getAttribute("role");
	int empId = (Integer) request.getAttribute("id");
	%>
	<form method="post" action="edit?id=<%=empId%>">
		ID : <label name="id"><%=empId%></label><br> <br>
		Name : <input type="text" name="name" value="<%=setName%>"><br>
		<br> Role : <input type="text" name="Cgpi" value="<%=setRole%>"><br>
		<br>
		<button name="edit">Update</button>

	</form>
</body>
</html>