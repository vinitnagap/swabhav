package com.techlabs.model;

public class OrderDB implements ICrudable {
	public void create() {
		System.out.println("Order created");
	}

	public void read() {
		System.out.println("Order readed");
	}

	public void update() {
		System.out.println("Order updated");
	}

	public void delete() {
		System.out.println("Order deleted");
	}
}
