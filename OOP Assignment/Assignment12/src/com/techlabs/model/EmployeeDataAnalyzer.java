package com.techlabs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeDataAnalyzer {
	TreeSet<Employee> employees = new TreeSet<Employee>(new SalaryComparator());

	public void loadData(IDatabaseLoader object) throws Exception {
		// FileLoader readFileData = new FileLoader();
		// UrlLoader readUrlData = new UrlLoader();
		ArrayList<String> lines = object.getData();
		// lines.addAll(readUrlData.getData());
		for (String line : lines) {
			String[] elements = line.split(",");
			int empId = Integer.parseInt(elements[0]);
			String empName = elements[1].replaceAll("'", "");
			String role = elements[2].replaceAll("'", "");
			int managerId = 0;
			if (!elements[3].equals("NULL")) {
				managerId = Integer.parseInt(elements[3]);
			}
			String joiningDate = elements[4].replaceAll("'", "");
			int salary = Integer.parseInt(elements[5]);
			int comm = 0;
			if (!elements[6].equals("NULL")) {
				comm = Integer.parseInt(elements[6]);
			}
			int deptId = Integer.parseInt(elements[7]);
			employees.add(new Employee(empId, empName, role, managerId,
					joiningDate, salary, comm, deptId));
		}
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

	public Employee getMaxSalariedEmployee() {
		Employee richEmployee = null;
		richEmployee = employees.first();
		for (Employee employee : employees) {
			if (richEmployee.getSalary() < employee.getSalary()) {
				richEmployee = employee;
			}
		}
		return richEmployee;
	}

	public Map<String, Integer> getDesignationwiseEmps() {
		TreeSet<String> designations = new TreeSet<String>();
		for (Employee employee : employees) {
			designations.add(employee.getRole());
		}
		TreeMap<String, Integer> group = new TreeMap<String, Integer>();
		for (String designation : designations) {
			int count = 0;
			for (Employee employee : employees) {
				if (designation.equalsIgnoreCase(employee.getRole()))
					count++;
			}
			group.put(designation, count);
		}
		return group;
	}

}