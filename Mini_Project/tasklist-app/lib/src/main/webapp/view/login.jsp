<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="loginDo" method="get">
		<s:textfield name="username" label="Username "></s:textfield>
		<br>
		<s:textfield name="password" type="password" label="Password "></s:textfield>
		<br>
		<s:submit value="Login"></s:submit>
	</form>
</body>
</html>