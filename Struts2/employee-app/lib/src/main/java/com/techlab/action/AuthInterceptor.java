package com.techlab.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		System.out.println("Inside Auth Interceptor");
		// System.out.println(session.getAttribute("user"));
		if (session == null) {
			return "failure";
		}
		if (session.getAttribute("user") != null) {
			if (session.getAttribute("user") == "admin") {
				return "success";
			}
		} else return "failure";
		return "failure";
	}

}
