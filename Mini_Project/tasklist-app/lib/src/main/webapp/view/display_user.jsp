<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<h1>User Details</h1>
<body>
	<s:form action="addUserBtn">
		<s:submit value="Add"></s:submit>
	</s:form>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Username</th>
				<th>Email-id</th>
				<th>Password</th>
				<th>Task</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="users">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="username" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="password" /></td>
					<td><s:form action="showtask">
							<s:hidden name="tasks" value="%{id}"></s:hidden>
							<s:submit value="Task"></s:submit>
						</s:form></td>
					<td><s:form action="editUserBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Edit"></s:submit>
						</s:form></td>
					<td><s:form action="deleteUserBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>

				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>