package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.UserViewModel;

public class LoginAction extends ActionSupport implements ModelDriven<UserViewModel> {
	@Autowired
	private UserService service;
	private UserViewModel vm;

	public UserViewModel getVm() {
		return vm;
	}

	public void setVm(UserViewModel vm) {
		this.vm = vm;
	}

	@Override
	public void validate() {
		if (vm.getUsername().equals("")) {
			addFieldError("username", "Enter Username");
		}
		if (vm.getPassword().equals("")) {
			addFieldError("password", "Enter Password");
		}
	}

	@Override
	public String execute() {
		if (service.validate(vm.getUsername(), vm.getPassword())) {
			return "success";
		} else
			return "error";
	}

	@Override
	public UserViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new UserViewModel();
		return vm;
	}

}
