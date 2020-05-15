package com.techlabs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DatabaseLoader {
	TreeSet<Employee> employees = new TreeSet<Employee>(new SalaryComparator());

	public void loadData() throws Exception {
		FileLoader readFileData = new FileLoader();
		UrlLoader readUrlData = new UrlLoader();
		ArrayList<String> lines = readFileData.getData();
		lines.addAll(readUrlData.getData());
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
}