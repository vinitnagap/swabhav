<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<style type="text/css">
table {
	margin: auto;
	width: 50%;
	padding: 10px;
	width: 100%;
	height: 100%;
}

body {
	background-color: aqua;
}
</style>
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<span class="navbar-brand mb-0 h1 display-4">Welcome</span> <a
			id="add" href="add" class="btn btn-dark">Add</a> <a href="logout"
			class="btn btn-dark">Logout</a>
	</nav>
	<table border="1" class="table table-dark">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Role</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="employees">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="role" /></td>
					<td><s:form action="update">
							<s:hidden name="editEmployee" value="%{id}"></s:hidden>
							<s:submit value="Edit" type="button" class="btn btn-warning"></s:submit>
						</s:form></td>
					<td><s:form action="delete">
							<s:hidden name="deleteEmployee" value="%{id}"></s:hidden>
							<s:submit value="Delete" type="button" class="btn btn-danger"></s:submit>
						</s:form></td>

				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>