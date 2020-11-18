package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techlab.model.Student;

@Service
public class StudentService {

	private static StudentService instance = null;
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private StudentService() {
		students = new ArrayList<Student>();
		students.add(new Student(null, "virat", "delhi", 31));
		students.add(new Student(null, "sachin", "mumbai", 42));
		students.add(new Student(null, "rohit", "goa", 25));
	}

	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentService();
		}
		return instance;
	}
}
