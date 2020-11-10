package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class LogoutAction implements Action, SessionAware {
	private SessionMap<String, Object> map;

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		map.put("user", null);
		return "success";
	}

}
