package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Employee;
import com.techlab.repository.EmployeeRepository;

@Service("employeesvc")
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public List<Employee> getEmployees() {
		return repository.getEmployees();

	}

	public void addEmployee(String name, String role) {

		repository.addEmployee(name, role);
	}

	public void deleteEmployee(String id) {
		repository.deleteEmployee(id);
	}

	public void updateEmployee(String id, String name, String role) {
		repository.updateEmployee(id, name, role);
	}

	public List<Employee> getEmployees(String name) {
		return repository.getEmployees(name);
	}

	public Employee searchEmployee(String id) {
		return repository.searchEmployee(id);
	}
}
