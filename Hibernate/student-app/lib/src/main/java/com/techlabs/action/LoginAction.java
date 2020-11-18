package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.LoginService;

public class LoginAction extends ActionSupport implements SessionAware {
	@Autowired
	private LoginService service;

	private SessionMap<String, Object> map;
	String username, password;
	String error = "error";

	public String start() {
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String doLogin() {
		System.out.println(username + " " + password);
		if (service.isValidate(username, password) == true) {
			System.out.println("inside login 1");
			map.put("loginId", username);
			return "success";
		} else {
			addActionError("Please Enter Valid Username & Password");
			return "login";
		}

	}

	public String logout() {
		map.remove("loginId");
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		map = (SessionMap<String, Object>) session;
	}

}