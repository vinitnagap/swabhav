package com.techlabs.model;

public class Customer {

	private String id;
	private String name;
	private int orders;
	private static int nextcount;

	static {
		nextcount = 1000;

	}

	public Customer(String name, int orders) {
		this.name = name;
		this.orders = orders;
		this.id = "C" + (++nextcount);

	}

	public String getId() {
		return id;
	}
}
