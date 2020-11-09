package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.viewmodel.RegisterVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterVM> {

	private RegisterVM vm;

	@Override
	public String execute() {
		return "success";
	}

	@Override
	public void validate() {
		if (vm.getFirstName().equals("")) {
			addFieldError("firstName", "Enter First Name");
		}
		if (vm.getLastName().equals("")) {
			addFieldError("lastName", "Enter Last Name");
		}
		if (vm.getEmailId().equals("")) {
			addFieldError("emailId", "Enter Email-id");
		}
		if (vm.getPassword().equals("")) {
			addFieldError("password", "Enter Password");
		}
		if (vm.getAge() == 0) {
			addFieldError("age", "Enter Age");
		}
	}

	@Override
	public RegisterVM getModel() {
		// TODO Auto-generated method stub
		vm = new RegisterVM();
		return vm;
	}

	public RegisterVM getUser() {
		return vm;
	}

	public void setUser(RegisterVM user) {
		this.vm = user;
	}

	public String registerDo() {
		String detailsMessage = "Registration Complete! Your Details are as follows :";
		String nameMessgae = "Name = " + vm.getFirstName() + " " + vm.getLastName();
		String ageMessage = "Age = " + vm.getAge();
		String emailMessage = "Email-id = " + vm.getEmailId();
		detailsMessage += nameMessgae + "\n" + ageMessage + "\n" + emailMessage;
		vm.setMessage(detailsMessage);
		return "success";
	}
}
