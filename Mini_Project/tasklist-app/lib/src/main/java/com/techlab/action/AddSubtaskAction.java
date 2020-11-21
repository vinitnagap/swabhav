package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Task;
import com.techlab.service.SubtaskService;
import com.techlab.viewmodel.AddTaskViewModel;

public class AddSubtaskAction extends ActionSupport implements ModelDriven<AddTaskViewModel>, SessionAware {
	@Autowired
	private SubtaskService service;
	private AddTaskViewModel vm;
	private SessionMap<String, Object> session;

	public String execute() {
		return "success";
	}

	public String addSubtaskDo() {
		Task task = (Task) session.get("task");
		if (task == null) {
			return "error";
		}
		service.addSubtask(vm.getTitle(), task);
		return "success";
	}

	public void validateAddSubtaskDo() {
		if (vm.getTitle().equals("")) {
			addFieldError("title", "Enter Title");
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;
	}

	@Override
	public AddTaskViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new AddTaskViewModel();
		return vm;
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

}
