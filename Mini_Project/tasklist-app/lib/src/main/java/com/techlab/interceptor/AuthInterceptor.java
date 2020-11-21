package com.techlab.interceptor;

import org.apache.struts2.dispatcher.SessionMap;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.service.UserService;

public class AuthInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		SessionMap<String, Object> sessionAttributes = (SessionMap<String, Object>) invocation.getInvocationContext()
				.getSession();
		ValueStack stack = invocation.getStack();
		String id = stack.findString("id");
		if (id != null) {
			User user = userService.getUser(id);
			if (user != null) {
				sessionAttributes.put("user", user);
			}
			Task task = taskService.getTask(id);
			if (task != null) {
				sessionAttributes.put("task", task);
			}
		}
		if (sessionAttributes == null || sessionAttributes.get("loginId") == null) {
			return "login";
		} else {
			if (!((String) sessionAttributes.get("loginId")).equals(null)) {
				System.out.println("Inside Interceptor" + sessionAttributes.get("task"));

				return invocation.invoke();
			} else {
				return "login";
			}
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
