<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<a href="add">Add</a>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="employees" >
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="role" /></td>
					<td><s:form action="update" method="get">
							<s:hidden name="editEmployee" value="%{id}"></s:hidden>
							<s:submit value="Edit"></s:submit>
						</s:form></td>
					<td><s:form action="delete">
							<s:hidden name="deleteEmployee" value="%{id}"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>

				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>