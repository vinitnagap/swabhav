package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;

	public List<Task> getTasks(String userId) {
		return repository.getTasks(userId);
	}

	public Task getTask(String id) {
		return repository.getTask(id);
	}

	public void addTask(String title, User user) {
		repository.addTask(title, user);
	}

	public void editTask(String id, String title) {
		repository.editTask(id, title);
	}

	public void deleteTask(String id) {
		repository.deleteTask(id);
	}
}
