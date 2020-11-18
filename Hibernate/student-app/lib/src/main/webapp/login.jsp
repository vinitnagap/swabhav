<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Enter Login Details</h1>
	<s:actionmessage />
	<s:actionerror />
	<form id="idLoginForm" action="loginUser" method="post">
		Enter Username <input type="text" name="username" /><br>Enter
		Password <input type="password" name="password" /><br> <input
			type="submit" value="submit" />
	</form>
</body>
</html>