<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<style type="text/css">
body {
	margin: auto;
	width: 50%;
	border: 3px solid black;
	padding: 10px;
	background-color: aqua;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="addRecord">
		<s:textfield name="name" label="Enter name"></s:textfield>
		<s:textfield name="role" label="Enter role"></s:textfield>
		<s:submit type="button" value="ADD RECORD" class="btn btn-primary"></s:submit>
	</s:form>

</body>
</html>