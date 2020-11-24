package com.techlab.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.AddUserViewModel;

public class AddUserAction extends ActionSupport implements ModelDriven<AddUserViewModel> {
	private AddUserViewModel vm;
	@Autowired
	private UserService service;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		service.addUser(vm.getFirstname(), vm.getLastname(), vm.getUsername(), vm.getEmailid(), vm.getPassword());
		return "success";
	}

	@Override
	public void validate() {
		if (vm.getFirstname().equals("")) {
			addFieldError("firstname", "*Enter First Name");
		}
		if (vm.getLastname().equals("")) {
			addFieldError("lastname", "*Enter Last Name");
		}
		if (vm.getUsername().equals("")) {
			addFieldError("username", "*Enter Username");
		}
		if (vm.getEmailid().equals("")) {
			addFieldError("emailid", "*Enter Email-id");
		}
		if (vm.getPassword().equals("")) {
			addFieldError("password", "*Enter Password");
		}
		if (!vm.getPassword().equals(vm.getConfirmPassword())) {
			addFieldError("confirmPassword", "*Enter Correct Password");
		}
	}

	@Override
	public AddUserViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new AddUserViewModel();
		return vm;
	}

	public AddUserViewModel getVm() {
		return vm;
	}

	public void setVm(AddUserViewModel vm) {
		this.vm = vm;
	}

	public String doAddUser() {
		return "input";
	}
}
