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
	<s:actionmessage />
	<s:actionerror />
	<form id="idLoginForm" action="loginUser" >
		Username = <input type="text" name="username" /><br> Password =
		<input type="password" name="password" /><br> <input
			type="submit" value="submit" />
	</form>
</body>
</html>