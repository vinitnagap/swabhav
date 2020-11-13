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
body {
	margin: auto;
	width: 50%;
	border: 3px solid black;
	padding: 10px;
	background-color: aqua;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<s:actionmessage />
	<s:actionerror />
	<form id="idLoginForm" action="loginUser">
		Username = <input type="text" name="username" /><br> Password =
		<input type="password" name="password" /><br>
		<button type="submit" class="btn btn-primary" value="Login">Login</button>
	</form>
</body>
</html>