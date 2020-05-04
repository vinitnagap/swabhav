package com.techlabs.model;

public class Professor extends Person implements SalariedEmployee {

	private double netSalary = 0;
	private double salaryPerLecture;

	public Professor(int id, String address, String dateOfBirth,
			double salaryPerLecture) {
		super(id, address, dateOfBirth);
		this.salaryPerLecture = salaryPerLecture;
	}

	public void updateSalary(int lectures) {
		this.netSalary = calculateNetSalary(lectures);

	}

	@Override
	public double calculateNetSalary(int lectures) {
		return (lectures * salaryPerLecture);
	}

	public double getNetSalary() {
		return netSalary;
	}

	public double getSalaryPerLecture() {
		return salaryPerLecture;
	}

	public String getPerson() {
		return "Professor";
	}
}
