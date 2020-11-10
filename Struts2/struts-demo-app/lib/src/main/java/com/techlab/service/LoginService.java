package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

	private static LoginService instance;
	private Map<String, String> map;

	private LoginService() {
		map = new HashMap<String, String>();
		map.put("admin", "admin");
		map.put("vinit", "vinit");
		map.put("sachin", "sachin");
	}

	public static LoginService getInstance() {
		if (instance == null) {
			instance = new LoginService();
			return instance;
		}
		return instance;
	}

	public boolean isValidate(String username, String password) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (username.equals(entry.getKey()) && password.equals(entry.getValue())) {
				return true;
			}
		}
		if (username.equals("") || password.equals("")) {
			return false;
		}
		return false;
	}
}
