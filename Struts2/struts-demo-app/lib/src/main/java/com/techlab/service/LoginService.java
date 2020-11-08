package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

	private Map<String, String> map;

	public LoginService() {
		map = new HashMap<String, String>();
		map.put("admin", "admin");
		map.put("vinit", "vinit");
		map.put("sachin", "sachin");
	}

	public boolean isValidate(String username, String password) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (username.equals(entry.getKey()) && password.equals(entry.getValue())) {
				return true;
			}
		}
		return false;
	}
}
