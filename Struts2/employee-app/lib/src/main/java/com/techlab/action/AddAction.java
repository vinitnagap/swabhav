package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class AddAction extends ActionSupport implements ModelDriven<Employee> {

	private Employee employee;

	@Override
	public String execute() {
		EmployeeService.getInstance().addEmployee(employee);
		return "success";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public Employee getModel() {
		employee = new Employee();
		return employee;
	}

	public String doAdd() {
		return "input";
	}

}
