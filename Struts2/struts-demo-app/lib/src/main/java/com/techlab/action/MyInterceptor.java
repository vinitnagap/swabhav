package com.techlab.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		String output = "Pre-processing";
		System.out.println(output);
		String result = invocation.invoke();

		output = "Post-processing";
		System.out.println(output);
		return result;
	}

}
