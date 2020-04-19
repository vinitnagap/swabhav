package com.techlabs.model;

public class Analyst extends Employee {
	
	private static final double PERKS = 0.40;

	public Analyst(String name, int id, GenderType gender, double basicSalary) {
		super(name, id, gender, basicSalary);
		role="Analyst";
	}

	@Override
	public double calculateNetSalary() {
		return (((PERKS*basicSalary)+basicSalary)*12);
	}

	@Override
	protected String[] calculateAllowances() {
		String[] allowances = {"Perks is " + (PERKS * basicSalary)};

		return allowances;
	}


}
