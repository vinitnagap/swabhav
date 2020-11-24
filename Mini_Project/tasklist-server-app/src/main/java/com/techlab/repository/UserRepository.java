package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.User;

@Repository
@Transactional
public class UserRepository {
	@Autowired
	private SessionFactory fact;

	public void addUser(String fname, String lname, String username, String email, String password) {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		fact.getCurrentSession().save(user);
	}

	public List<User> getUsers() {
		List<User> users = fact.getCurrentSession().createQuery("from User").list();
		return users;
	}

	public User getUser(String id) {
		for (User user : getUsers()) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

	public User getUserByUsername(String username) {
		for (User user : getUsers()) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	public void editUser(String id, String fname, String lname, String email, String username, String password) {
		User user = getUser(id);
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		fact.getCurrentSession().update(user);
	}

	public void deleteUser(String id) {
		fact.getCurrentSession().delete(getUser(id));
	}

	public boolean validate(String username, String password) {
		// List<User> users = new ArrayList<User>();
		// users = fact.getCurrentSession().createQuery("from User").list();
		// System.out.println(users);
		for (User user : getUsers()) {
			System.out.println(user.getUsername());
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
