package com.techlab.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.UserService;

public class RegisterAction extends ActionSupport {
	@Autowired
	private UserService service;
	private String firstname;
	private String lastname;
	private String username;
	private String emailid;
	private String password;
	private String confirmPassword;
	private String captchaCode;

	@Override
	public String execute() throws Exception {
		return "success";
	}

	public String doRegister() {
		service.addUser(getFirstname(), getLastname(), getUsername(), getEmailid(), getPassword());
		return "success";
	}

	public void validateDoRegister() {

		if (getFirstname().equals("")) {
			addFieldError("firstname", "*Enter First Name");
		}
		if (getLastname().equals("")) {
			addFieldError("lastname", "*Enter Last Name");
		}
		if (getUsername().equals("")) {
			addFieldError("username", "*Enter Username");
		}
		if (getEmailid().equals("")) {
			addFieldError("emailid", "*Enter Email-id");
		}
		if (getPassword().equals("")) {
			addFieldError("password", "*Enter Password");
		}
		if (!getPassword().equals(getConfirmPassword())) {
			addFieldError("confirmPassword", "*Enter Correct Password");
		}

		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		boolean isHuman = captcha.validate(getCaptchaCode());
		if (!isHuman) {
			addFieldError("captchaCode", "*Incorrect code");
		}
		System.out.println(captcha.getCaptchaId());
		// reset captcha code textbox
		setCaptchaCode(null);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

}
