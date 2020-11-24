<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<style type="text/css">
.errorMessage {
	color: red;
}

body {
	background-image:
		url("https://images.pexels.com/photos/1764702/pexels-photo-1764702.jpeg?cs=srgb&dl=pexels-tim-mossholder-1764702.jpg&fm=jpg");
	background-size: 100%;
}
</style>
<meta charset="ISO-8859-1">
<title>Add Task</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Enter Task Details</a>
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
			</ul>
		</div>
		<form class="form-inline my-2 my-lg-0">
			<a class="btn btn-danger" href="logout">Logout</a>
		</form>
	</nav>
	<s:form action="addTask" method="post">
		<s:textfield name="title" label="Title"></s:textfield>
		<s:submit value="Add" class="btn btn-success"></s:submit>
	</s:form>
</body>
</html>