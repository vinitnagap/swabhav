package com.techlab.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.Subtask;
import com.techlab.entity.Task;
import com.techlab.service.SubtaskService;

public class DisplaySubtaskAction extends ActionSupport implements SessionAware {

	private String id;
	private List<Subtask> subtasks;
	private SessionMap<String, Object> session;
	@Autowired
	private SubtaskService service;

	public String execute() {
		Task task = (Task) session.get("task");
		if (task == null) {
			return "error";
		}
		subtasks = service.getSubtasks(task.getId());
		return "success";
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

	public List<Subtask> getSubtasks() {
		return subtasks;
	}

	public void setSubtasks(List<Subtask> subtasks) {
		this.subtasks = subtasks;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}

}
