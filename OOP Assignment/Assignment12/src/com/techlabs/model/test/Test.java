package com.techlabs.model.test;

import java.util.Collection;

import com.techlabs.model.DatabaseLoader;
import com.techlabs.model.Employee;

public class Test {
	public static void main(String[] args) throws Exception {
		DatabaseLoader databaseObject = new DatabaseLoader();
		databaseObject.loadData();
		Collection<Employee> employees = databaseObject.getEmployees();
		Employee richEmployee = null;
		for (Employee employee : employees) {
			richEmployee = employee;
			printInfo(employee);
		}
		for (Employee employee : employees) {
			if (richEmployee.getSalary() < employee.getSalary()) {
				richEmployee = employee;
			}
		}
		System.out.println("\nRichest Employee");
		printInfo(richEmployee);

		String m = "Manager", c = "Clerk", p = "President", s = "Salesman", a = "Analyst";
		int managerCount = 0, clerkCount = 0, presidentCount = 0, salesmanCount = 0, analystCount = 0, deptId10 = 10, deptId20 = 20, deptId30 = 30, deptId10Count = 0, deptId20Count = 0, deptId30Count = 0;
		for (Employee employee : employees) {
			if (m.equalsIgnoreCase(employee.getRole())) {
				managerCount++;
			}
			if (c.equalsIgnoreCase(employee.getRole())) {
				clerkCount++;
			}
			if (p.equalsIgnoreCase(employee.getRole())) {
				presidentCount++;
			}
			if (s.equalsIgnoreCase(employee.getRole())) {
				salesmanCount++;
			}
			if (a.equalsIgnoreCase(employee.getRole())) {
				analystCount++;
			}
			if (deptId10 == employee.getDeptId()) {
				deptId10Count++;
			}
			if (deptId20 == employee.getDeptId()) {
				deptId20Count++;
			}
			if (deptId30 == employee.getDeptId()) {
				deptId30Count++;
			}
		}
		System.out.println("\nTotalCount\nManager:" + managerCount + "\nClerk:"
				+ clerkCount + "\nPresident:" + presidentCount + "\nSalesman:"
				+ salesmanCount + "\nAnalyst:" + analystCount);
		System.out.println("\nTotalCountOnDeptNo\nDeptNo:10 has "
				+ deptId10Count + "\nDeptNo:20 has " + deptId20Count
				+ "\nDeptNo:30 has " + deptId30Count);
	}

	private static void printInfo(Employee employee) {
		System.out.print("Emp Id:" + employee.getEmployeeId());
		System.out.print(" Name:" + employee.getEmployeeName());
		System.out.print(" Role:" + employee.getRole());
		System.out.print(" ManagerId:" + employee.getManagerId());
		System.out.print(" Joining Date:" + employee.getJoiningDate());
		System.out.print(" Salary:" + employee.getSalary());
		System.out.print(" Comm:" + employee.getComm());
		System.out.println(" Dept Id:" + employee.getDeptId());
	}

}
