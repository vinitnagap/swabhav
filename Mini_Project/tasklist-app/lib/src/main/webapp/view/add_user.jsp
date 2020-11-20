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
<title>Register</title>
</head>
<body>
	<s:form action="addUser" method="get">
		<s:textfield name="firstname" label="First Name"></s:textfield>
		<s:textfield name="lastname" label="Last Name"></s:textfield>
		<s:textfield name="username" label="Username"></s:textfield>
		<s:textfield name="emailid" label="Email-id"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="Register"></s:submit>

	</s:form>
</body>
</html>