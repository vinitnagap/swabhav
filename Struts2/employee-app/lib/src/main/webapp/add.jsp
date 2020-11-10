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
	<s:form action="addRecord">
		<s:textfield name="name" label="Enter name"></s:textfield>
		<s:textfield name="role" label="Enter role"></s:textfield>
		<s:submit value="ADD RECORD"></s:submit>
	</s:form>

</body>
</html>