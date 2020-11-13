package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.EmployeeService;

public class DeleteAction extends ActionSupport {

	private String deleteEmployee;
	@Autowired
	EmployeeService empService;

	public String getDeleteEmployee() {
		return deleteEmployee;
	}

	public void setDeleteEmployee(String deleteEmployee) {
		this.deleteEmployee = deleteEmployee;
	}

	@Override
	public String execute() {
		System.out.println(deleteEmployee);
		empService.deleteEmployee(deleteEmployee);
		return "success";
	}

}
