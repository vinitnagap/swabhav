package com.techlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repository;

	public boolean isValidate(String username, String password) {
		return repository.isValidate(username, password);
	}
}
