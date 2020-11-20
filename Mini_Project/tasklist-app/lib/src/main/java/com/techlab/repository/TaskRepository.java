package com.techlab.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Task;
import com.techlab.entity.User;

@Repository
@Transactional
public class TaskRepository {
	@Autowired
	private SessionFactory fact;

	public List<Task> getTasks(String userId) {
		List<Task> tasks = new ArrayList<Task>();
		for (Task task : (List<Task>) fact.getCurrentSession().createQuery("from Task").list()) {
			if (task.getUser().getId().equals(userId)) {
				tasks.add(task);
			}
		}
		return tasks;
	}

	public Task getTask(String id) {
		for (Task task : (List<Task>) fact.getCurrentSession().createQuery("from Task").list()) {
			if (task.getId().equals(id)) {
				return task;
			}
		}
		return null;
	}

	public void addTask(String title, User user) {
		Task task = new Task(UUID.randomUUID().toString(), title, getCurrentDateTime(), false, user);
	}

	public void editTask(String id, String title) {
		Task task = getTask(id);
		task.setTitle(title);
		task.setDate(getCurrentDateTime());
		fact.getCurrentSession().update(task);
	}

	public void deleteTask(String id) {
		fact.getCurrentSession().delete(getTask(id));
	}

	private String getCurrentDateTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		return formatter.format(date);
	}
}
