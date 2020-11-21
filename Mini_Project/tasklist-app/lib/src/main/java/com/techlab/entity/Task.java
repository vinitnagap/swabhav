package com.techlab.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Task {

	@Id
	private String id;
	private String title;
	private String date;
	private boolean done;

	public Task() {

	}

	public Task(String id, String title, String date, boolean done, User user) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.done = done;
		this.user = user;
	}

	@ManyToOne
	@JoinColumn
	private User user;

	@OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Subtask> subTask = new HashSet<Subtask>();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Subtask> getSubTask() {
		return subTask;
	}

	public void setSubTask(Set<Subtask> subTask) {
		this.subTask = subTask;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}