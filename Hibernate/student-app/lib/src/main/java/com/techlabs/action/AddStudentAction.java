package com.techlabs.action;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class AddStudentAction extends ActionSupport implements ModelDriven<Student> {

	@Autowired
	private StudentService service;
	private Student student;

	public String execute() {
		return SUCCESS;

	}

	public void validate() {
		if ("".equals(student.getName())) {
			addFieldError("name", "Enter Name");
		}
		if (student.getAge() == 0) {
			addFieldError("age", "Enter age");
		}
		if (student.getAge() == 0) {
			addFieldError("rollno", "Enter RollNo");
		}
	}

	public String doAdd() {
		student.setId(UUID.randomUUID().toString());
		System.out.println("success " + student.getId() + "  " + student.getName() + " adding");
		service.addStudent(student);
		return SUCCESS;
	}

	@Override
	public Student getModel() {
		student = new Student();
		return student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}