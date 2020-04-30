package com.techlabs.model;

public class Professor extends Person {

	private double netSalary = 0;
	private double salaryPerHour;

	public Professor(int id, String address, String dateOfBirth,
			double salaryPerHour) {
		super(id, address, dateOfBirth);
		this.salaryPerHour = salaryPerHour;
	}

	public void updateSalary(int hours) {
		this.netSalary = calculateNetSalary(hours);

	}

	private double calculateNetSalary(int hours) {
		return (hours * salaryPerHour);
	}

	public double getNetSalary() {
		return netSalary;
	}

	public double getSalaryPerHour() {
		return salaryPerHour;
	}

	public String getPerson() {
		return "Professor";
	}
}
