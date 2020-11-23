<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<style type="text/css">
.errorMessage {
	color: red;
}

body {
	background-image:
		url("https://images.pexels.com/photos/1764702/pexels-photo-1764702.jpeg?cs=srgb&dl=pexels-tim-mossholder-1764702.jpg&fm=jpg");
	background-size: 100%;
}
</style>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<s:form action="registerDo" method="post">
		<s:textfield name="firstname" label="First Name"></s:textfield>
		<s:textfield name="lastname" label="Last Name"></s:textfield>
		<s:textfield name="username" label="Username"></s:textfield>
		<s:textfield name="emailid" label="Email-id"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:password name="confirmPassword" label="Confirm Password"></s:password>
		<!-- Adding BotDetect Captcha to the page -->
		<botDetect:captcha id="exampleCaptcha" userInputID="captchaCode"></botDetect:captcha>

		<s:textfield name="captchaCode" label="Enter Captcha" />
		<s:submit value="Register" class="btn btn-primary"></s:submit>
	</s:form>
	<p>
		Already Registered?<br>
		<a href="login" class="btn btn-success">Login</a>
	</p>
</body>
</html>