package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class StudentAction extends ActionSupport {

	@Autowired
	private StudentService service;
	private List<Student> students;

	public String execute() {
		students = service.getStudents();
		return SUCCESS;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}