package com.techlabs.model.test;

import com.techlabs.model.*;

public class StudentTestCase1 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "abc");
		System.out.println(s1.getStudentCount());

		Student s2 = new Student(102, "xyz");
		System.out.println(s1.getStudentCount());

		Student s3 = new Student(103, "lmno", 8.0f);
		System.out.println(s1.getStudentCount());

		System.out.println(Student.headCount());

	}

	/*
	 * public static void printInfo(Student p) { System.out.println("ID = " +
	 * p.getId()); System.out.println("NAME = " + p.getName());
	 * System.out.println("CGPA = " + p.getCgpa()); }
	 */
}
