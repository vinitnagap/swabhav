package com.techlabs.model;

public class CustomerDB implements ICrudable {
	public void create() {
		System.out.println("Customer created");
	}

	public void read() {
		System.out.println("Customer readed");
	}

	public void update() {
		System.out.println("Customer updated");
	}

	public void delete() {
		System.out.println("Customer deleted");
	}
}
