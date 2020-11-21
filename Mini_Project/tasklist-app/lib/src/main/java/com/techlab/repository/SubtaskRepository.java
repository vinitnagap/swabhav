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

import com.techlab.entity.Subtask;
import com.techlab.entity.Task;

@Repository
@Transactional
public class SubtaskRepository {
	@Autowired
	private SessionFactory fact;

	public List<Subtask> getSubtasks(String taskId) {
		List<Subtask> subtasks = new ArrayList<Subtask>();
		for (Subtask subtask : (List<Subtask>) fact.getCurrentSession().createQuery("from Subtask").list()) {
			if (subtask.getTask().getId().equals(taskId)) {
				subtasks.add(subtask);
			}
		}
		return subtasks;
	}

	@SuppressWarnings("unchecked")
	public Subtask getSubtask(String id) {
		for (Subtask subtask : (List<Subtask>) fact.getCurrentSession().createQuery("from Subtask").list()) {
			if (subtask.getId().equals(id)) {
				return subtask;
			}
		}
		return null;
	}

	public void addSubtask(String title, Task task) {
		Subtask subtask = new Subtask(UUID.randomUUID().toString(), title, getCurrentDateTime(), false, task);
		fact.getCurrentSession().save(subtask);
	}

	public void editSubtask(String id, String title) {
		Subtask subtask = getSubtask(id);
		subtask.setTitle(title);
		subtask.setDate(getCurrentDateTime());
		fact.getCurrentSession().update(subtask);
	}

	public void deleteSubtask(String id) {
		fact.getCurrentSession().delete(getSubtask(id));
	}

	private String getCurrentDateTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		return formatter.format(date);
	}
}
