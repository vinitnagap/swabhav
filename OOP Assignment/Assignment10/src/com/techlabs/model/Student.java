package com.techlabs.model;

public class Student extends Person {
	private Branch branch;

	public Student(int id, String address, String dateOfBirth, Branch branch) {
		super(id, address, dateOfBirth);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}

	public String getPerson() {
		return "Student";
	}
}
