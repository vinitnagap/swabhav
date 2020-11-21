package com.techlab.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subtask {

	@Id
	private String id;
	private String title;
	private String date;
	private boolean done;
	@ManyToOne
	@JoinColumn
	private Task task;

	public Subtask() {
		// TODO Auto-generated constructor stub
	}

	public Subtask(String id, String title, String date, boolean done, Task task) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.done = done;
		this.task = task;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}