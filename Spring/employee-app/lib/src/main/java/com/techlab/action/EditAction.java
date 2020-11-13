package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;
import com.techlab.viewmodel.EditVM;

public class EditAction extends ActionSupport implements ModelDriven<EditVM> {

	private EditVM employee;
	private String editEmployee;
	@Autowired
	EmployeeService empService;

	public String getEditEmployee() {
		return editEmployee;
	}

	public void setEditEmployee(String editEmployee) {
		this.editEmployee = editEmployee;
	}

	@Override
	public String execute() {
		empService.updateEmployee(employee.getId(), employee.getName(), employee.getRole());
		return "success";
	}

	public String doEdit() {
		System.out.println(employee);
		Employee emp = empService.searchEmployee(editEmployee);
		employee = new EditVM();
		employee.setId(editEmployee);
		employee.setName(emp.getName());
		employee.setRole(emp.getRole());
		return "success";
	}

	public EditVM getEmployee() {
		return employee;
	}

	public void setEmployee(EditVM employee) {
		this.employee = employee;
	}

	@Override
	public EditVM getModel() {
		employee = new EditVM();
		return employee;
	}

}
