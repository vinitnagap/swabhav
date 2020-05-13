package com.techlabs.model;

public class Student implements Comparable {

	public int rollno;
	public int standard;
	public String name;
	public double cgpa;

	public Student(int rollno, int standard, String name, double cgpa) {
		this.rollno = rollno;
		this.standard = standard;
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public int hashCode() {

		return Integer.parseInt(rollno + "" + standard);
	}

	@Override
	public boolean equals(Object a) {
		Student object = (Student) a;
		if (this.hashCode() == object.hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		if (this.rollno == student.rollno && this.standard == student.standard)
			return 0;
		return 1;
	}
}
