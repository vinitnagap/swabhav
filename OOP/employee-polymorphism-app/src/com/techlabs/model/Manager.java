package com.techlabs.model;

public class Manager extends Employee {

	public Manager(String name, int id, GenderType gender, double basicSalary) {
		super(name, id, gender, basicSalary);
	}

	@Override
	public double calculateNetSalary() {
		/*
		 * System.out.println("Basic Salary = " + basicSalary);
		 * System.out.println("HRA = " + 0.5 * basicSalary);
		 * System.out.println("TA = " + 0.4 * basicSalary);
		 * System.out.println("DA = " + 0.3 * basicSalary);
		 */
		return (2.2 * basicSalary);

	}
}
