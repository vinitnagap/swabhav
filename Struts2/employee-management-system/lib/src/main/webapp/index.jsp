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
	<a href="getemployees">Get Record</a>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="employees">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="designation" /></td>
					<td><s:property value="salary" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>