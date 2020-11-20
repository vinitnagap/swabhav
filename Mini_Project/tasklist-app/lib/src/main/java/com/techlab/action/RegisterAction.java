package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.AddUserViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<AddUserViewModel> {
	@Autowired
	private UserService service;
	private AddUserViewModel addUserVM;

	public AddUserViewModel getAddUserVM() {
		return addUserVM;
	}

	public void setAddUserVM(AddUserViewModel addUserVM) {
		this.addUserVM = addUserVM;
	}

	@Override
	public String execute() throws Exception {
		service.addUser(addUserVM.getFirstname(), addUserVM.getLastname(), addUserVM.getUsername(), addUserVM.getEmailid(),
				addUserVM.getPassword());
		return "success";
	}

	@Override
	public void validate() {
		if (addUserVM.getFirstname().equals("")) {
			addFieldError("firstname", "Enter First Name");
		}
		if (addUserVM.getLastname().equals("")) {
			addFieldError("lastname", "Enter Last Name");
		}
		if (addUserVM.getUsername().equals("")) {
			addFieldError("username", "Enter Username");
		}
		if (addUserVM.getEmailid().equals("")) {
			addFieldError("emailid", "Enter Email-id");
		}
		if (addUserVM.getPassword().equals("")) {
			addFieldError("password", "Enter Password");
		}

	}

	@Override
	public AddUserViewModel getModel() {
		// TODO Auto-generated method stub
		addUserVM = new AddUserViewModel();
		return addUserVM;
	}
}
