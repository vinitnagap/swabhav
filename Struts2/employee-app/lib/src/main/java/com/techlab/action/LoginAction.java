package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlab.service.LoginService;

public class LoginAction implements SessionAware, Action {
	private SessionMap<String, Object> map;
	private HttpSession session = ServletActionContext.getRequest().getSession(false);
	String username, password, message;

	public String getUsername() {
		return username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
		map.put("user", "admin");
		return "success";

	}

	public String loginDo() {
		// LoginService service = LoginService.getInstance();
//		if (session == null || session.getAttribute("user") == null) {
//			message = "Login";
//			return "input";
//		} else if (session.getAttribute("user") == "admin") {
//			return "success";
		// }
		if (username == null) {
			message = "Enter Username";
			return "input";
		} else if (password == null) {
			message = "Enter Password";
			return "input";
		} else if (LoginService.getInstance().isValidate(username, password) == false) {
			message = "Incorrect Username & Password";
			return "input";
		}
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		map = (SessionMap<String, Object>) session;
	}

}
