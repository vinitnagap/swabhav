package com.techlabs.model;

public class Manager extends Employee {

	private static final double HRA = 0.50f;
	private static final double TA = 0.40f;
	private static final double DA = 0.10f;

	public Manager(String name, int id, GenderType gender, double basicSalary) {
		super(name, id, gender, basicSalary);
		role = "Manager";
	}

	@Override
	public double calculateNetSalary() {

		return (((basicSalary * HRA) + (basicSalary * TA) + (basicSalary * DA) + basicSalary) * 12);
	}

	@Override
	protected String[] calculateAllowances() {
		String[] allowances = { "HRA is " + (HRA * basicSalary),
				" TA is " + (TA * basicSalary), " DA is " + (DA * basicSalary) };

		return allowances;
	}
}
