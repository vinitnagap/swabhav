package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private SessionFactory fact;

	public EmployeeRepository() {
		// TODO Auto-generated constructor stub
	}

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees = fact.getCurrentSession().createQuery("from Employee").list();
		return employees;

	}

	public void addEmployee(String name, String role) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setRole(role);
		fact.getCurrentSession().save(employee);
	}

	public void deleteEmployee(String id) {
		Employee employee = (Employee) fact.getCurrentSession().load(Employee.class, id);
		fact.getCurrentSession().delete(employee);
	}

	public void updateEmployee(String id, String name, String role) {
		Employee employee = (Employee) fact.getCurrentSession().load(Employee.class, id);
		employee.setName(name);
		employee.setRole(role);
		fact.getCurrentSession().update(employee);
	}

	public List<Employee> getEmployees(String name) {
		List<Employee> employees = new ArrayList<Employee>();
		employees = fact.getCurrentSession().createQuery("from Employee").list();
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getName().equals(name)) {
				emps.add(employee);
			}
		}
		return emps;
	}

	public Employee searchEmployee(String id) {
		List<Employee> employees = new ArrayList<Employee>();
		employees = fact.getCurrentSession().createQuery("from Employee").list();
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}
}