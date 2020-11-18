package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Student;
import com.techlabs.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public StudentService() {
		System.out.println("inside service");
	}

	public List<Student> getStudents() {
		return repository.getStudents();
	}

	public void addStudent(Student s) {
		repository.addStudent(s);
	}

	public void deleteStudent(String id) {
		repository.deleteStudent(id);
	}

	public void updateStudent(Student s) {
		repository.updateStudent(s);
	}

	public Student getStudentById(String id) {
		return repository.getStudentById(id);
	}
}