<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sendemail" method="post">
		<label>First Name : </label> 
		<input type="text" name="firstName" /><br><br>
		<label>Last Name : </label> 
		<input type="text" name="lastName" /><br><br>
		<label>Age : </label>
		<input type="number" name="age" /><br><br> 
		<label>Email : </label> 
		<input type="text" name="to" /><br><br> 

		<!-- Adding BotDetect Captcha to the page -->
		<botDetect:captcha id="exampleCaptcha" userInputID="captchaCode"></botDetect:captcha>

		<br /><label for="captchaCode"> Enter Captcha : </label>
		<s:textfield name="captchaCode" /><br><br>
		<input type="submit" value="Register" />
	</form>
</body>
</html>