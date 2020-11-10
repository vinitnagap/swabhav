package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class EditAction extends ActionSupport implements ModelDriven<Employee> {

	private Employee employee;
	private String editEmployee;

	public String getEditEmployee() {
		return editEmployee;
	}

	public void setEditEmployee(String editEmployee) {
		this.editEmployee = editEmployee;
	}

	@Override
	public String execute() {
		EmployeeService service = EmployeeService.getInstance();
		service.updateEmployee(employee);
		return "success";
	}

	public String doEdit() {
		System.out.println(employee);
		employee = EmployeeService.getInstance().searchEmployee(editEmployee);
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

}
