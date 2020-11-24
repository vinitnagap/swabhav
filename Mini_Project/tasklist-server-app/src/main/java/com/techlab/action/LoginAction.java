package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;
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
	private boolean admin;
	private String msg;

	public UserViewModel getVm() {
		return vm;
	}

	public void setVm(UserViewModel vm) {
		this.vm = vm;
	}

	@Override
	public void validate() {
		System.out.println(vm.getUsername() + " " + vm.getPassword());
		if (vm.getUsername().equals("")) {
			addFieldError("username", "*Enter Username");
		}
		if (vm.getPassword().equals("")) {
			addFieldError("password", "*Enter Password");
		}
	}

	@Override
	public String execute() {
		if (service.validate(vm.getUsername(), vm.getPassword())) {
			System.out.println(admin);
			if (admin) {
				// System.out.println(admin);
				map.put("admin", vm.getUsername());
			}
			map.put("loginId", vm.getUsername());
			return "success";
		} else
			this.msg = "*Enter Valid Username & Password";
		return "input";
	}

	@SkipValidation
	public String logout() {
		map.remove("loginId");
		map.remove("admin");
		return "success";
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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
