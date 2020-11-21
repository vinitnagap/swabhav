package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Subtask;
import com.techlab.entity.Task;
import com.techlab.repository.SubtaskRepository;

@Service
public class SubtaskService {
	@Autowired
	private SubtaskRepository repository;

	public List<Subtask> getSubtasks(String taskId) {
		return repository.getSubtasks(taskId);
	}

	public Subtask getSubtask(String id) {
		return repository.getSubtask(id);
	}

	public void addSubtask(String title, Task task) {
		repository.addSubtask(title, task);
	}

	public void editSubtask(String id, String title) {
		repository.editSubtask(id, title);
	}

	public void deleteSubtask(String id) {
		repository.deleteSubtask(id);
	}

}
