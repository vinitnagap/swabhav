package com.techlabs.model;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class EmployeeDataAnalyzer implements IEmployeeList {
	TreeSet<Employee> employees = new TreeSet<>(new SalaryComparator());

	public EmployeeDataAnalyzer(ILoader object) throws Exception {
		List<String> lines = object.getData();
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
			employees.add(new Employee(empId, empName, role, managerId, joiningDate, salary, comm, deptId));
		}
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		String details = "";
		for (Employee employee : employees) {
			details += employee.getEmployeeName() + "\n";
			for (Employee emp : employees) {
				if (employee.getEmployeeId() == emp.getManagerId()) {
					details += emp.getEmployeeName();
				}
			}
		}
		return details;
	}

}