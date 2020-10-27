package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeData {
	private static EmployeeData instance;
	public List<Employee> employees;
	Employee emp1 = new Employee(UUID.randomUUID(), "Virat", "Developer");
	Employee emp2 = new Employee(UUID.randomUUID(), "Sachin", "Analyst");
	Employee emp3 = new Employee(UUID.randomUUID(), "Dhoni", "Analyst");
	Employee emp4 = new Employee(UUID.randomUUID(), "Ram", "Accountant");
	Employee emp5 = new Employee(UUID.randomUUID(), "Gopal", "Manager");

	private EmployeeData() {
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

	public static EmployeeData getInstance() {
		if (instance == null) {
			instance = new EmployeeData();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		return employees;

	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
}
