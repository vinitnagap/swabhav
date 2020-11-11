package com.techlab.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();
		if (sessionAttributes == null || sessionAttributes.get("loginId") == null) {
			return "login";
		} else {
			if (!((String) sessionAttributes.get("loginId")).equals(null)) {
				return invocation.invoke();
			} else {
				return "login";
			}
		}
	}

}
