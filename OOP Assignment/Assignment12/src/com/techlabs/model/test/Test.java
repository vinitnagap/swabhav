package com.techlabs.model.test;

import java.util.Collection;
import java.util.Map;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.FileLoader;

public class Test {
	public static void main(String[] args) throws Exception {
		EmployeeDataAnalyzer databaseObject = new EmployeeDataAnalyzer(
				new FileLoader());
		Collection<Employee> employees = databaseObject.getEmployees();
		for (Employee employee : employees) {
			printInfo(employee);
		}
		System.out.println("\nRichest Employee");
		printInfo(databaseObject.getMaxSalariedEmployee());

		Map<String, Integer> group = databaseObject.getDesignationwiseEmps();
		System.out.println(group);

	}

	private static void printInfo(Employee employee) {
		System.out.print("Emp Id:" + employee.getEmployeeId());
		System.out.print(" Name:" + employee.getEmployeeName());
		System.out.print(" Designation:" + employee.getDesignation());
		System.out.print(" ManagerId:" + employee.getManagerId());
		System.out.print(" Joining Date:" + employee.getJoiningDate());
		System.out.print(" Salary:" + employee.getSalary());
		System.out.print(" Comm:" + employee.getComm());
		System.out.println(" Dept Id:" + employee.getDeptId());
	}

}
