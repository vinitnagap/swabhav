package com.techlabs.model;

public class Analyst extends Employee {

	public Analyst(String name, int id, GenderType gender, double basicSalary) {
		super(name, id, gender, basicSalary);
	}

	@Override
	public double calculateNetSalary() {
		/*
		 * System.out.println("Basic Salary = " + basicSalary);
		 * System.out.println("Perks = " + 0.3 * basicSalary);
		 */
		return (1.3 * basicSalary);

	}

}
