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
<title>Subtask Details</title>
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
					style="margin: 5px;" href="addSubtaskBtn">Add Subtask<span
						class="sr-only">(current)</span>
				</a>
			</ul>
		</div>
		<form class="form-inline my-2 my-lg-0">
			<a class="btn btn-danger" href="logout">Logout</a>
		</form>
	</nav>
	<h1>Subtask Details</h1>
	<table border="1" class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Checked</th>
				<th scope="col">Title</th>
				<th scope="col">Date</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="subtasks">
				<tr>
					<td scope="row"><input type="checkbox" name="checkbox"
						class="strikethrough" value="1"></td>
					<td scope="row"><s:property value="title" /></td>
					<td scope="row"><s:property value="date" /></td>
					<td scope="row"><s:form action="editSubtaskBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Edit" class="btn btn-warning"></s:submit>
						</s:form></td>
					<td scope="row"><s:form action="deleteSubtaskBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Delete" class="btn btn-danger"></s:submit>
						</s:form></td>

				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>