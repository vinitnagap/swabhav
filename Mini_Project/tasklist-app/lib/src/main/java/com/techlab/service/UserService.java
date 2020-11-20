package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.User;
import com.techlab.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public void addUser(String fname, String lname, String username, String email, String password) {
		repository.addUser(fname, lname, username, email, password);
	}

	public boolean validate(String username, String password) {
		return repository.validate(username, password);
	}

	public List<User> getUsers() {
		return repository.getUsers();
	}

	public User getUser(String id) {
		return repository.getUser(id);
	}

	public void editUser(String id, String fname, String lname, String email, String username, String password) {
		repository.editUser(id, fname, lname, email, username, password);
	}

	public void deleteUser(String id) {
		repository.deleteUser(id);
	}
}
