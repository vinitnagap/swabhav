package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

	public Student getStudent(String rollNo) {
		for (Student student : students) {
			if (student.getRollNo().equals(rollNo)) {
				return student;
			}
		}
		return null;
	}

	public void addStudent(Student student) {
		student.setRollNo(UUID.randomUUID().toString());
		students.add(student);
	}

	public void updateStudent(Student student) {
		Student stud = getStudent(student.getRollNo());
		stud.setName(student.getName());
		stud.setAddress(student.getAddress());
		stud.setAge(student.getAge());
	}

	public void deleteStudent(String rollNo) {
		students.remove(getStudent(rollNo));
	}
}
