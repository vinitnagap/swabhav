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
	<form action="login.do.action" method="post">
		Username = <input type="text" name="username" /><br> Password =
		<input type="password" name="password" /><br> <input
			type="submit" value="submit" />
	</form>
	<p style="color: red">
		<s:property value="message" />
	</p>
</body>
</html>