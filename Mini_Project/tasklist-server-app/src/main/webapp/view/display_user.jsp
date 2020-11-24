<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<style type="text/css">
body {
	background-image:
		url("https://images.pexels.com/photos/301717/pexels-photo-301717.jpeg?cs=srgb&dl=pexels-pixabay-301717.jpg&fm=jpg");
	background-size: 100%;
}
</style>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Welcome</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="btn btn-info"
					style="margin: 5px;" href="users">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="btn btn-info"
					style="margin: 5px;" href="addUserBtn">Add User <span
						class="sr-only">(current)</span>
				</a>
			</ul>
		</div>
		<form class="form-inline my-2 my-lg-0">
			<a class="btn btn-danger" href="logout">Logout</a>
		</form>
	</nav>

	<h1>User Details</h1>
	<table border="1" class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Username</th>
				<th scope="col">Email-id</th>
				<th scope="col">Password</th>
				<th scope="col">Task Count</th>
				<th scope="col">Task</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="users">
				<tr>
					<td scope="row"><s:property value="id" /></td>
					<td scope="row"><s:property value="firstName" /></td>
					<td scope="row"><s:property value="lastName" /></td>
					<td scope="row"><s:property value="username" /></td>
					<td scope="row"><s:property value="email" /></td>
					<td scope="row"><s:property value="password" /></td>
					<td><s:property value="%{task.size}" /></td>
					<td scope="row"><s:form action="showtask">
							<s:hidden name="id" value="%{id}"></s:hidden>

							<s:submit value="Show Task" class="btn btn-success"></s:submit>
						</s:form></td>
					<td scope="row"><s:form action="editUserBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Edit" class="btn btn-warning"></s:submit>
						</s:form></td>
					<td scope="row"><s:form action="deleteUserBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Delete" class="btn btn-danger"></s:submit>
						</s:form></td>

				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>