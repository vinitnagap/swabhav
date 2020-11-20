package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.EditUserViewModel;

public class EditUserAction extends ActionSupport implements ModelDriven<EditUserViewModel> {

	private EditUserViewModel vm;
	@Autowired
	private UserService service;

	@Override
	public String execute() {
		System.out.println(vm.getId());
		User user = service.getUser(vm.getId());
		vm.setFirstname(user.getFirstName());
		vm.setLastname(user.getLastName());
		vm.setUsername(user.getUsername());
		vm.setEmailid(user.getEmail());
		vm.setPassword(user.getPassword());
		return "success";
	}

	public void validateDoEditUser() {
		if (vm.getFirstname().equals("")) {
			addFieldError("firstname", "Enter First Name");
		}
		if (vm.getLastname().equals("")) {
			addFieldError("lastname", "Enter Last Name");
		}
		if (vm.getUsername().equals("")) {
			addFieldError("username", "Enter Username");
		}
		if (vm.getEmailid().equals("")) {
			addFieldError("emailid", "Enter Email-id");
		}
		if (vm.getPassword().equals("")) {
			addFieldError("password", "Enter Password");
		}
	}

	public String doEditUser() {
		service.editUser(vm.getId(), vm.getFirstname(), vm.getLastname(), vm.getEmailid(), vm.getUsername(),
				vm.getPassword());
		return "success";
	}

	@Override
	public EditUserViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new EditUserViewModel();
		return vm;
	}

	public EditUserViewModel getVm() {
		return vm;
	}

	public void setVm(EditUserViewModel vm) {
		this.vm = vm;
	}

}
