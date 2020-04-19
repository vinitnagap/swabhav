package com.techlabs.model;

public class AddressDB implements ICrudable {

	public void create() {
		System.out.println("Address created");
	}

	public void read() {
		System.out.println("Address readed");
	}

	public void update() {
		System.out.println("Address updated");
	}

	public void delete() {
		System.out.println("Address deleted");
	}
}
