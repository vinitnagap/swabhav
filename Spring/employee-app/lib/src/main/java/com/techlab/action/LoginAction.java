package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.repository.LoginRepository;
import com.techlab.service.LoginService;

public class LoginAction extends ActionSupport implements SessionAware {
	private SessionMap<String, Object> map;
	String username, password;
	@Autowired
	LoginService loginService;

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

	@Override
	public String execute() throws Exception {
		System.out.println(username + " " + password);
		if (loginService.isValidate(username, password) == true) {
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
