package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.StudentService;

public class DeleteStudentAction extends ActionSupport {

	private String deleteStudent;
	@Autowired
	private StudentService service;

	public String execute() {
		service.deleteStudent(deleteStudent);
		return SUCCESS;
	}

	public String getDeleteStudent() {
		return deleteStudent;
	}

	public void setDeleteStudent(String deleteStudent) {
		this.deleteStudent = deleteStudent;
	}
}