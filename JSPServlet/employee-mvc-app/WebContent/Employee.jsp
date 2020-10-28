<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.techlabs.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Record</title>
</head>
<body>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	%>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (Employee employee : employees) {
			%>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getRole()%></td>
				<td><%
					out.print("<a href='edit?id=" + employee.getId() + "'>Edit</a> ");
				%><td>
				<td><%
					out.print("<a href='edit?name=" + employee.getName() + "'>Delete</a> ");
				%><td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<a href="add.jsp">Add</a>
</body>
</html>