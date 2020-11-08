package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private int age;
	private String firstName, lastName, emailId, password;

	@Override
	public String execute() {
		return "success";
	}

	@Override
	public void validate() {
		if (firstName.equals("")) {
			addFieldError("firstName", "Enter First Name");
		}
		if (lastName.equals("")) {
			addFieldError("lastName", "Enter Last Name");
		}
		if (emailId.equals("")) {
			addFieldError("emailId", "Enter Email-id");
		}
		if (password.equals("")) {
			addFieldError("password", "Enter Password");
		}
		if (age == 0) {
			addFieldError("age", "Enter Age");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
