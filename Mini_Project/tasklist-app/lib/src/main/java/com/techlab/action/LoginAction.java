package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.UserViewModel;

public class LoginAction extends ActionSupport implements ModelDriven<UserViewModel>, SessionAware {
	@Autowired
	private UserService service;
	private UserViewModel vm;
	private SessionMap<String, Object> map;

	public UserViewModel getVm() {
		return vm;
	}

	public void setVm(UserViewModel vm) {
		this.vm = vm;
	}

	@Override
	public void validate() {
		if (vm.getUsername().equals("")) {
			addFieldError("username", "Enter Username");
		}
		if (vm.getPassword().equals("")) {
			addFieldError("password", "Enter Password");
		}
	}

	@Override
	public String execute() {
		if (service.validate(vm.getUsername(), vm.getPassword())) {
			map.put("loginId", vm.getUsername());
			return "success";
		} else
			return "error";
	}

	@Override
	public UserViewModel getModel() {
		// TODO Auto-generated method stub
		vm = new UserViewModel();
		return vm;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;

	}

	public SessionMap<String, Object> getMap() {
		return map;
	}

	public void setMap(SessionMap<String, Object> map) {
		this.map = map;
	}

}
