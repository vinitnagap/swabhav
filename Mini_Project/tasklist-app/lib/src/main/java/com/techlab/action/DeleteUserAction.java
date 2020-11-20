package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.UserService;

public class DeleteUserAction implements Action {
	private String id;
	@Autowired
	private UserService service;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(id);
		service.deleteUser(id);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
