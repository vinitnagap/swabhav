package com.techlabs.model;

public class Senior {
	private int id;
	private String name;
	private String designation;
	private int yearly_experience;

	public Senior(int id, String name, String designation, int yearly_experience) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.yearly_experience = yearly_experience;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getYearly_experience() {
		return yearly_experience;
	}

	public void setYearly_experience(int yearly_experience) {
		this.yearly_experience = yearly_experience;
	}

}
