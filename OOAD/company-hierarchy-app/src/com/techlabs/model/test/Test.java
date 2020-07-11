package com.techlabs.model.test;

import java.util.Map;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.FileLoader;

public class Test {
	public static void main(String[] args) throws Exception {
		EmployeeDataAnalyzer databaseObject = new EmployeeDataAnalyzer(new FileLoader());
		databaseObject.addEmployee(new Employee(141, "Vinit", "Developer", 7839, "03-May-20", 35000, 1500, 20));
		for (Map.Entry employee : databaseObject.getEmployees().entrySet()) {
			Employee referredEmployee = (Employee) employee.getValue();
			if (referredEmployee.getDesignation().contains("PRESIDENT")) {
				System.out.println(referredEmployee.show(0));
			}
		}

	}
}
