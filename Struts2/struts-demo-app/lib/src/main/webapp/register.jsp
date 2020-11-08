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
	<s:form action="registerprocess">
		<s:textfield name="firstName" label="First Name"></s:textfield>
		<s:textfield name="lastName" label="Last Name"></s:textfield>
		<s:textfield name="age" label="Age"></s:textfield>
		<s:textfield name="emailId" label="Email-id"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="Register"></s:submit>
		<!--  	<s:property value="message" /> -->
	</s:form>
</body>
</html>