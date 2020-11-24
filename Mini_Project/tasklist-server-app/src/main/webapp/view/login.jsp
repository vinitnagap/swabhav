<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.errorMessage {
	color: red;
}

.login-form {
	width: 340px;
	margin: 50px auto;
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div class="login-form">
		<form action="loginDo" method="post">
			<h2 class="text-center">Log in</h2>
			<div class="form-group">
				<s:textfield name="username" class="form-control"
					placeholder="Username"></s:textfield>
				<br>
			</div>
			<div class="form-group">
				<s:textfield name="password" type="password" class="form-control"
					placeholder="Password"></s:textfield>
				<br>
			</div>
			<div>
				<s:checkbox name="admin" value="%{admin}" label="isAdmin?"></s:checkbox>
			</div>
			<div class="form-group">
				<s:submit value="Login" class="btn btn-primary btn-block"></s:submit>
			</div>
			<a style="color: red"> <s:property value="msg" />
			</a>
		</form>
		<p class="text-center">
			<a href="register">Create an Account</a>
		</p>
	</div>
</body>
</html>