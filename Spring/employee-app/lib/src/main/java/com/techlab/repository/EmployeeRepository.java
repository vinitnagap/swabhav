package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.techlab.model.Employee;
import com.techlab.viewmodel.AddVM;

@Repository
public class EmployeeRepository {
	private static EmployeeRepository instance;
	public List<Employee> employees;
	Employee emp1 = new Employee(UUID.randomUUID().toString(), "Virat", "Developer");
	Employee emp2 = new Employee(UUID.randomUUID().toString(), "Sachin", "Analyst");
	Employee emp3 = new Employee(UUID.randomUUID().toString(), "Dhoni", "Analyst");
	Employee emp4 = new Employee(UUID.randomUUID().toString(), "Ram", "Accountant");
	Employee emp5 = new Employee(UUID.randomUUID().toString(), "Gopal", "Manager");

	private EmployeeRepository() {
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

	public static EmployeeRepository getInstance() {
		if (instance == null) {
			instance = new EmployeeRepository();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		return employees;

	}

	public void addEmployee(String name, String role) {

		employees.add(new Employee(UUID.randomUUID().toString(), name, role));
	}

	public void deleteEmployee(String id) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				employees.remove(employee);
				break;
			}
		}
	}

	public void updateEmployee(String id, String name, String role) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				employee.setName(name);
				employee.setRole(role);
			}
		}
	}

	public List<Employee> getEmployees(String name) {
		System.out.println("Inside Search");
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getName().equals(name)) {
				System.out.println(employee.getName());
				emps.add(employee);
			}
		}
		return emps;
	}

	public Employee searchEmployee(String id) {
		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				return employee;
			}
		}
		return null;
	}
}