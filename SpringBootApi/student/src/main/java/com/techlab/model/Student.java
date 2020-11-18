package com.techlab.model;

public class Student {

	private String rollNo;
	private String name;
	private String address;
	private int age;

	public Student() {

	}

	public Student(String rollNo, String name, String address, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
