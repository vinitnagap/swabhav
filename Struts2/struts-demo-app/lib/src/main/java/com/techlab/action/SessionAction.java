package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class SessionAction implements SessionAware {

	private SessionMap<String, Object> map;

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;
	}

	public String execute() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		if (session.getAttribute("counter") == null) {
			map.put("counter", 0);
		} else {
			map.put("counter", (int) session.getAttribute("counter") + 1);
		}
		return "success";
	}

}
