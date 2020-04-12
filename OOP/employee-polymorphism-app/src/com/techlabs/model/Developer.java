package com.techlabs.model;

public class Developer extends Employee {

	public Developer(String name, int id, GenderType gender, double basicSalary) {
		super(name, id, gender, basicSalary);
	}

	@Override
	public double calculateNetSalary() {
		/*
		 * System.out.println("Basic Salary = " + basicSalary);
		 * System.out.println("PA = " + 0.4 * basicSalary);
		 * System.out.println("Bonus = " + 0.3 * basicSalary);
		 */
		return (1.7 * basicSalary);

	}
}
