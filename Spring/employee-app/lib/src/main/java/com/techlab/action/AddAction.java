package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.EmployeeService;
import com.techlab.viewmodel.AddVM;

public class AddAction extends ActionSupport implements ModelDriven<AddVM> {

	private AddVM employee;
	@Autowired
	EmployeeService empService;

	@Override
	public void validate() {
		if (employee.getName().equals("") || employee.getName() == null) {
			addFieldError("name", "Enter Name");
		}
		if (employee.getRole().equals("") || employee.getRole() == null) {
			addFieldError("role", "Enter Role");
		}
	}

	@Override
	public String execute() {
		empService.addEmployee(employee.getName(), employee.getRole());
		return "success";
	}

	public AddVM getEmployee() {
		return employee;
	}

	public void setEmployee(AddVM employee) {
		this.employee = employee;
	}

	@Override
	public AddVM getModel() {
		employee = new AddVM();
		return employee;
	}

	public String doAdd() {
		return "input";
	}

}
