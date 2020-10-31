package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private int id;
	private String name;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Senior> seniors = new ArrayList<Senior>();

	public Company(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public void addPartner(Partner partner) {
		partners.add(partner);

	}

	public List<Partner> getPartners() {
		return partners;
	}

	public List<Senior> getSeniors() {
		return seniors;
	}

	public void addSenior(Senior senior) {
		seniors.add(senior);

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
}
