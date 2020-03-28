package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int count;

	static {
		count = 0;
		System.out.println("Inside static block");
	}

	public Student(int id, String name, float cgpa) {
		count = count + 1;
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		System.out.println("Inside constructor");
	}

	public Student(int id, String name) {
		this(id, name, 7.0f);
	}

	public static int headCount() {
		return count;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public int getStudentCount() {
		return count;
	}
}
