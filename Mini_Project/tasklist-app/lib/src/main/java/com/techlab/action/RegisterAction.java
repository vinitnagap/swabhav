package com.techlab.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.AddUserViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<AddUserViewModel> {
	@Autowired
	private UserService service;
	private AddUserViewModel addUserVM;
	private String captchaCode;

	public AddUserViewModel getAddUserVM() {
		return addUserVM;
	}

	public void setAddUserVM(AddUserViewModel addUserVM) {
		this.addUserVM = addUserVM;
	}

	@Override
	public String execute() throws Exception {
		service.addUser(addUserVM.getFirstname(), addUserVM.getLastname(), addUserVM.getUsername(),
				addUserVM.getEmailid(), addUserVM.getPassword());
		return "success";
	}

	@Override
	public void validate() {
		if (addUserVM.getFirstname().equals("") || addUserVM.getFirstname() == null) {
			addFieldError("firstname", "Enter First Name");
		}
		if (addUserVM.getLastname().equals("") || addUserVM.getLastname() == null) {
			addFieldError("lastname", "Enter Last Name");
		}
		if (addUserVM.getUsername().equals("") || addUserVM.getUsername() == null) {
			addFieldError("username", "Enter Username");
		}
		if (addUserVM.getEmailid().equals("") || addUserVM.getEmailid() == null) {
			addFieldError("emailid", "Enter Email-id");
		}
		if (addUserVM.getPassword().equals("") || addUserVM.getPassword() == null) {
			addFieldError("password", "Enter Password");
		}
		if (addUserVM.getConfirmPassword().equals("") || addUserVM.getConfirmPassword() == null) {
			addFieldError("confirmPassword", "Enter Confirm Password");
		}
		if (!addUserVM.getPassword().equals(addUserVM.getConfirmPassword())) {
			addFieldError("confirmPassword", "Enter Correct Password");
		}

		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		boolean isHuman = captcha.validate(captchaCode);
		if (!isHuman) {
			addFieldError("captchaCode", "Incorrect code");
		}
		System.out.println(captcha.getCaptchaId());
		// reset captcha code textbox
		captchaCode = null;
	}

	@Override
	public AddUserViewModel getModel() {
		// TODO Auto-generated method stub
		addUserVM = new AddUserViewModel();
		return addUserVM;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

}
