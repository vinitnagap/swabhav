package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {
	public static void main(String[] args) {
		Manager m = new Manager("abc", 101, GenderType.MALE, 50000);
		printSalarySlip(m);
		System.out.println();

		Developer d = new Developer("xyz", 102, GenderType.FEMALE, 30000);
		printSalarySlip(d);
		System.out.println();

		Analyst a = new Analyst("mno", 103, GenderType.MALE, 70000);
		printSalarySlip(a);
		System.out.println();
	}

	public static void printSalarySlip(Employee emp) {
		System.out.println("Id : " + emp.getId() + "  Name : " + emp.getName()
				+ "  Basic salary : " + emp.getBasicSalary() + "  Gender : "
				+ emp.getGender() + "  Net Salary :  " + emp.getNetSalary()
				+ "  Role : " + emp.getRole());
		printAllowances(emp.getAllownaces());
	}

	public static void printAllowances(String[] allowances) {
		for (String allowance : allowances) {
			System.out.print(allowance);
		}
		System.out.println();
	}

}
