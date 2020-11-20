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
	<s:form action="editUser" method="post">
		<s:hidden name="id" value="%{vm.id}"></s:hidden>
		<s:textfield name="firstname" label="First Name" value="%{vm.firstname}"></s:textfield>
		<s:textfield name="lastname" label="Last Name" value="%{vm.lastname}"></s:textfield>
		<s:textfield name="username" label="Username" value="%{vm.username}"></s:textfield>
		<s:textfield name="emailid" label="Email-id" value="%{vm.emailid}"></s:textfield>
		<s:password name="password" label="Password" value="%{vm.password}"></s:password>
		<s:submit value="Edit"></s:submit>

	</s:form>
</body>
</html>