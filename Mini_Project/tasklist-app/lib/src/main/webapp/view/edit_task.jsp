<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
	<s:form action="editTask" method="post">
		<s:hidden name="id" value="%{vm.id}"></s:hidden>
		<s:textfield name="title" label="Enter Title" value="%{vm.title}"></s:textfield>
		<s:submit value="Edit"></s:submit>

	</s:form>
</body>
</html>