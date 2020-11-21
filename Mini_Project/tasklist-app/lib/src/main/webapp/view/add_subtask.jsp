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
<title>Insert title here</title>
</head>
<body>
	<s:form action="addSubtask" method="get">
		<s:textfield name="title" label="Title"></s:textfield>
		<s:submit value="Add"></s:submit>
	</s:form>
</body>
</html>