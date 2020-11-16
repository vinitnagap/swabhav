package com.techlab.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {

	private static LoginRepository instance;
	private Map<String, String> map;

	private LoginRepository() {
		map = new HashMap<String, String>();
		map.put("admin", "admin");
		map.put("vinit", "vinit");
		map.put("sachin", "sachin");
	}

	public static LoginRepository getInstance() {
		if (instance == null) {
			instance = new LoginRepository();
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
