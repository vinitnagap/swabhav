package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.Employee;

public class EmployeeService {
	private static EmployeeService instance;
	public List<Employee> employees;
	Employee emp1 = new Employee(UUID.randomUUID(), "Virat", "Developer");
	Employee emp2 = new Employee(UUID.randomUUID(), "Sachin", "Analyst");
	Employee emp3 = new Employee(UUID.randomUUID(), "Dhoni", "Analyst");
	Employee emp4 = new Employee(UUID.randomUUID(), "Ram", "Accountant");
	Employee emp5 = new Employee(UUID.randomUUID(), "Gopal", "Manager");

	private EmployeeService() {
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

	public static EmployeeService getInstance() {
		if (instance == null) {
			instance = new EmployeeService();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		return employees;

	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public void deleteEmployee(String id) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				employees.remove(employee);
			}
		}
	}
}
