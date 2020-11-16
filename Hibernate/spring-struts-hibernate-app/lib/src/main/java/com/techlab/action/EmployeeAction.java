package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.Employee;
import com.techlab.service.EmployeeService;

public class EmployeeAction extends ActionSupport {
	private List<Employee> employees;
	@Autowired
	EmployeeService empService;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String execute() {
		employees = empService.getEmployees();
		return "success";
	}
}
