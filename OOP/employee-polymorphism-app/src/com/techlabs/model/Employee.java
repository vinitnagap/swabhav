package com.techlabs.model;

public abstract class Employee {

	private String name;
	private int id;
	private GenderType gender;
	protected double basicSalary;

	public Employee(String name, int id, GenderType gender, double basicSalary) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public abstract double calculateNetSalary();

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
}
