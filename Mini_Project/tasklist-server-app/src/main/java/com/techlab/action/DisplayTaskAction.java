package com.techlab.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.TaskService;

public class DisplayTaskAction implements Action, SessionAware {

	private List<Task> tasks;
	@Autowired
	private TaskService service;
	private String id;
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Display task = "+session.get("user"));
		User user = (User) session.get("user");
		
		if (user == null) {
			return "error";
		}
		tasks = service.getTasks(user.getId());
		return "success";
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public String getUserId() {
		return id;
	}

	public void setUserId(String userId) {
		this.id = userId;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}

}
