package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {
	public static void main(String[] args) {
		Manager m = new Manager("abc", 101, GenderType.MALE, 50000);
		printSalarySlip(m);

		Developer d = new Developer("xyz", 102, GenderType.FEMALE, 30000);
		printSalarySlip(d);

		Analyst a = new Analyst("mno", 103, GenderType.MALE, 70000);
		printSalarySlip(a);
	}

	public static void printSalarySlip(Employee e) {
		System.out.println("Name = " + e.getName());
		System.out.println("ID = " + e.getId());
		System.out.println("Gender = " + e.getGender());
		System.out.println("Net Salary = " + e.calculateNetSalary());
		System.out.println();
	}

}
