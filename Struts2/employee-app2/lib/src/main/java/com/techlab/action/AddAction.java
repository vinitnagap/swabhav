package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.EmployeeService;
import com.techlab.viewmodel.AddVM;

public class AddAction extends ActionSupport implements ModelDriven<AddVM> {

	private AddVM employee;

	@Override
	public String execute() {
		EmployeeService.getInstance().addEmployee(employee.getName(), employee.getRole());
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
