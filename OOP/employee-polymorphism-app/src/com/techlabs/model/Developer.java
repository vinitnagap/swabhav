package com.techlabs.model;

public class Developer extends Employee {

	private static final double PA = 0.40;
	private static final double BONUS = 0.30;

	public Developer(String name, int id, GenderType gender, double basicSalary) {
		super(name, id, gender, basicSalary);
		role = "Developer";
	}

	@Override
	public double calculateNetSalary() {
		return (((basicSalary * PA) + (basicSalary * BONUS) + basicSalary) * 12);
	}

	@Override
	protected String[] calculateAllowances() {
		String[] allowances = { "PA is " + (PA * basicSalary),
				" Bonus is " + (BONUS * basicSalary) };

		return allowances;
	}

}
