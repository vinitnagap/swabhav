package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.LoginService;

public class LoginAction extends ActionSupport {
	private String username, password, message;

	@Override
	public void validate() {
		if (username.equals("")) {
			addFieldError("username", "Enter Username");
		}
		if (password.equals("")) {
			addFieldError("password", "Enter Password");
		}
	}

	public String getUsername() {
		return username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Execute");
		LoginService service = new LoginService();
		if (service.isValidate(username, password)) {
			return "success";
		}
//		if (username.equals("")) {
//			message = "username is required";
//			return "input";
//		}
//		if (password.equals("")) {
//			message = "password is required";
//			return "input";
//		}
		return "error";
	}

//	public String loginDo() throws Exception {
//		if (username.equals("")) {
//			message = "username is required";
//			return "input";
//		}
//		if (password.equals("")) {
//			message = "password is required";
//			return "input";
//		}
//		execute();
//		return null;
//
//	}
}
