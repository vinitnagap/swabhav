package com.techlabs.model.test;

import com.techlabs.model.Branch;
import com.techlabs.model.Professor;
import com.techlabs.model.Student;

public class Test {
	public static void main(String args[]) {
		Student student = new Student(11756, "Mumbai", "10/05/1995",
				Branch.COMPUTER);
		printInfo(student);

		Professor professor = new Professor(125682, "Kerala", "05/25/1975",
				5000);
		professor.updateSalary(30);
		printInfo(professor);
	}

	public static void printInfo(Student student) {
		System.out.println("Person = " + student.getPerson() + "\nID = "
				+ student.getId() + " Branch is: " + student.getBranch()
				+ " Address = " + student.getAddress() + " Date of Birth = "
				+ student.getDateOfBirth());
	}

	public static void printInfo(Professor professor) {
		System.out.println("Person = " + professor.getPerson() + "\nID = "
				+ professor.getId() + " Salary : " + professor.getNetSalary()
				+ " Address = " + professor.getAddress() + " Date of Birth = "
				+ professor.getDateOfBirth());
	}

}
