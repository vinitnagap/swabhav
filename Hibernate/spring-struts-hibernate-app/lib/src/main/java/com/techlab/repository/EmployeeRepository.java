package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Employee;

@Repository
public class EmployeeRepository {
	private static EmployeeRepository instance;
	@Autowired
	SessionFactory sessionFactory;

	private EmployeeRepository() {
	}

	public static EmployeeRepository getInstance() {
		if (instance == null) {
			instance = new EmployeeRepository();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		Session session = sessionFactory.openSession();
		List<Employee> employees = new ArrayList<Employee>();
		employees = session.createQuery("from Student").list();
		return employees;

	}

	public void addEmployee(String name, String role) {
		Session session = sessionFactory.openSession();
		Employee employee = new Employee();
		employee.setName(name);
		employee.setRole(role);
		session.save(employee);
	}

	public void deleteEmployee(String id) {
		Session session = sessionFactory.openSession();
		Employee employee = (Employee) session.load(Employee.class, id);
		session.delete(employee);
	}

	public void updateEmployee(String id, String name, String role) {
		Session session = sessionFactory.openSession();
		Employee employee = (Employee) session.load(Employee.class, id);
		employee.setName(name);
		employee.setRole(role);
		session.update(employee);
	}

	public List<Employee> getEmployees(String name) {
		Session session = sessionFactory.openSession();
		List<Employee> employees = new ArrayList<Employee>();
		employees = session.createQuery("from Student").list();
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getName().equals(name)) {
				emps.add(employee);
			}
		}
		return emps;
	}

	public Employee searchEmployee(String id) {
		Session session = sessionFactory.openSession();
		List<Employee> employees = new ArrayList<Employee>();
		employees = session.createQuery("from Student").list();
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}
}