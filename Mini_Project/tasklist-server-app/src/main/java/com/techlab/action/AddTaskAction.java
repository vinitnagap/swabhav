package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.viewmodel.AddTaskViewModel;

public class AddTaskAction extends ActionSupport implements ModelDriven<AddTaskViewModel>, SessionAware {
	@Autowired
	private TaskService service;
	private AddTaskViewModel vm;
	private SessionMap<String, Object> session;

	@Override
	public String execute() {
		return "success";
	}

	public String addTaskDo() {
		User user = (User) session.get("user");
		service.addTask(vm.getTitle(), user);
		return "success";
	}

	@Override
	public AddTaskViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new AddTaskViewModel();
		return vm;
	}

	public void validateAddTaskDo() {
		if (vm.getTitle().equals("")) {
			addFieldError("title", "*Enter Title");
		}
	}

	public AddTaskViewModel getVm() {
		return vm;
	}

	public void setVm(AddTaskViewModel vm) {
		this.vm = vm;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;

	}

}
