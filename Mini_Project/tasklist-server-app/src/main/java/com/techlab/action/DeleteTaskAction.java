package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.User;
import com.techlab.service.TaskService;

public class DeleteTaskAction extends ActionSupport {

	@Autowired
	TaskService service;
	String id;

	@Override
	public String execute() {
		service.deleteTask(id);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
