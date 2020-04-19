package com.techlabs.model;

public abstract class Employee {

	private String name;
	private int id;
	private GenderType gender;
	protected double basicSalary;
	private double netSalary;
	private String[] allowances;
	protected String role;

	public Employee(String name, int id, GenderType gender, double basicSalary) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.basicSalary = basicSalary;
		this.netSalary = calculateNetSalary();
		this.allowances = calculateAllowances();

	}

	protected abstract double calculateNetSalary();

	protected abstract String[] calculateAllowances();

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public GenderType getGender() {
		return gender;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public String getRole() {
		return role;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public String[] getAllownaces() {
		return allowances;
	}
}
