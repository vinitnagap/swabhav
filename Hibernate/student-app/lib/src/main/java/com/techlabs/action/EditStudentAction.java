package com.techlabs.action;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class EditStudentAction extends ActionSupport implements ModelDriven<Student> {

	@Autowired
	private StudentService service;
	private String editStudent;
	private Student editStudentObject;

	@Override
	public Student getModel() {
		editStudentObject = new Student();
		return editStudentObject;
	}

	public String execute() {
		editStudentObject = service.getStudentById(editStudent);
		return "success";
	}

	public String doEdit() {
		service.updateStudent(editStudentObject);
		return SUCCESS;
	}

	public String getEditStudent() {
		return editStudent;
	}

	public void setEditStudent(String editStudent) {
		this.editStudent = editStudent;
	}

	public Student getEditStudentObject() {
		return editStudentObject;
	}

	public void setEditStudentObject(Student editStudentObject) {
		this.editStudentObject = editStudentObject;
	}

}