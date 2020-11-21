<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<h1>Subtask Details</h1>
<body>
	<s:form action="addSubtaskBtn">
		<s:submit value="Add"></s:submit>
	</s:form>
	<table border="1">
		<thead>
			<tr>
				<th>Checked</th>
				<th>Title</th>
				<th>Date</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="subtasks">
				<tr>
					<td></td>
					<td><s:property value="title" /></td>
					<td><s:property value="date" /></td>
					<td><s:form action="editSubtaskBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Edit"></s:submit>
						</s:form></td>
					<td><s:form action="deleteSubtaskBtn">
							<s:hidden name="id" value="%{id}"></s:hidden>
							<s:submit value="Delete"></s:submit>
						</s:form></td>

				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>