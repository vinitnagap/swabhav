<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="updateRecord">
		<s:hidden name="id" value="%{employee.id}"></s:hidden>
		<s:textfield name="name" label="Enter name" value="%{employee.name}"></s:textfield>
		<s:textfield name="role" label="Enter role" value="%{employee.role}"></s:textfield>
		<s:submit value="EDIT RECORD"></s:submit>
	</s:form>
</body>
</html>