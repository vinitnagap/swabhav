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
	<s:form action="loginprocess">
		<s:textfield name="username" label="Name"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="login"></s:submit>
	<!--  	<s:property value="message" /> -->
	</s:form>
</body>
</html>