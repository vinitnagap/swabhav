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
	<!-- 	<s:form method="post" action="login.do.action">
		<s:textfield name="username" label="Name"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="login"></s:submit>
	</s:form>
	<p style="color: red">
		<s:property value="message" />
	</p>  -->
	<form action="login.do.action" method="post">
		Username = <input type="text" name="username" /><br> Password = <input
			type="password" name="password" /><br> <input type="submit"
			value="submit" />
	</form>
	<p style="color: red">
		<s:property value="message" />
	</p>
</body>
</html>