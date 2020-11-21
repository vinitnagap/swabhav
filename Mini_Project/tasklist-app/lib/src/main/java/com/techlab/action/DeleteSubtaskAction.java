package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.SubtaskService;

public class DeleteSubtaskAction extends ActionSupport {
	private String id;
	@Autowired
	private SubtaskService service;

	@Override
	public String execute() {
		service.deleteSubtask(id);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
