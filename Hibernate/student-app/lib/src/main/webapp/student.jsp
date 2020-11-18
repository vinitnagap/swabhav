<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
	<h1>Student Details</h1>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>RollNo</th>
				<th>Age</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="students">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="rollno" /></td>
					<td><s:property value="age" /></td>
					<td><s:form action="edit">
							<s:hidden name="editStudent" value="%{id}" />
							<s:submit value="edit"></s:submit>
						</s:form></td>
					<td><s:form action="delete">
							<s:hidden name="deleteStudent" value="%{id}" />
							<s:submit value="delete"></s:submit>
						</s:form></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>

	<a href="add">add</a>
</body>
</html>