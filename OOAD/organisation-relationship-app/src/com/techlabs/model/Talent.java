package com.techlabs.model;

import java.util.UUID;

public class Talent {

	private UUID id;
	private String name;
	private double cgpa;
	private String partner;
	private String techstack;

	public Talent(UUID id, String name, double cgpa, String partner,
			String techstack) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.partner = partner;
		this.techstack = techstack;
	}

	public UUID getId() {
		return id;

	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public String getPartner() {
		return partner;

	}

	public String getTechStack() {
		return techstack;
	}

}
