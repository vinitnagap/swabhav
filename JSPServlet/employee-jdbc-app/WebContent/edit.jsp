<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.techlabs.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EditController" method="POST">
		<%
			Employee employee = (Employee) request.getAttribute("editEmployee");
		%>
		<label>Name</label> <input type="text" name="name"
			value="<%=employee.getName()%>"><br> <label>Role</label>
		<input type="text" name="role" value="<%=employee.getRole()%>"><br>
		<input type="hidden" name="id" value="<%=employee.getId()%>">
		<input type="submit" value="Change">

	</form>
</body>
</html>