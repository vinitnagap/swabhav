package com.techlabs.model.test;

import java.util.Map;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.FileLoader;

public class Test {
	public static void main(String[] args) throws Exception {
		EmployeeDataAnalyzer databaseObject = new EmployeeDataAnalyzer(new FileLoader());
		for (Map.Entry employee : databaseObject.getEmployees().entrySet()) {
			Employee referredEmployee = (Employee) employee.getValue();
			if (referredEmployee.getDesignation().contains("PRESIDENT")) {
				System.out.println(referredEmployee.show(0));
			}
		}

	}
}
