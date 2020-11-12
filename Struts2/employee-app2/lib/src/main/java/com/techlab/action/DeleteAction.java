package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.EmployeeService;

public class DeleteAction extends ActionSupport {

	private String deleteEmployee;

	public String getDeleteEmployee() {
		return deleteEmployee;
	}

	public void setDeleteEmployee(String deleteEmployee) {
		this.deleteEmployee = deleteEmployee;
	}

	@Override
	public String execute() {
		System.out.println(deleteEmployee);
		EmployeeService.getInstance().deleteEmployee(deleteEmployee);
		return "success";
	}

}
