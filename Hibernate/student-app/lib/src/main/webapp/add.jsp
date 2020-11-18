<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.UUID"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h1>Add Student</h1>
	<s:form action="doAdd">
		<s:textfield name="name" label="Enter Name " value=""></s:textfield>
		<s:textfield name="rollno" label="Enter RollNo " type="number"
			value=""></s:textfield>
		<s:textfield name="age" label="Enter age " type="number" value=""></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>