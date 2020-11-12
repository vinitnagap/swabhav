package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;
import com.techlab.viewmodel.EditVM;

public class EditAction extends ActionSupport implements ModelDriven<EditVM> {

	private EditVM employee;
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
		service.updateEmployee(employee.getId(), employee.getName(), employee.getRole());
		return "success";
	}

	public String doEdit() {
		System.out.println(employee);
		Employee emp = EmployeeService.getInstance().searchEmployee(editEmployee);
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
