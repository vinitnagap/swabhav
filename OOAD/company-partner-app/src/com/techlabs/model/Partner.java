package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Partner {
	private int id;
	private String name;
	private int total_emp;
	private List<Senior> seniors = new ArrayList<Senior>();

	public Partner(int id, String name, int total_emp) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.total_emp = total_emp;
	}

	public void addSenior(Senior senior) {
		seniors.add(senior);

	}
	public List<Senior> getSeniors() {
		return seniors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal_emp() {
		return total_emp;
	}

	public void setTotal_emp(int total_emp) {
		this.total_emp = total_emp;
	}

}
