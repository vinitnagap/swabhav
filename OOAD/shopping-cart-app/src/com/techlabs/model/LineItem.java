package com.techlabs.model;

import java.util.UUID;

public class LineItem {

	private UUID id;
	private int quantity;
	private Product product;

	public LineItem(UUID id, int quantity, Product product) {
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}

	public double calculateItemCost() {
		return quantity * product.totalCost();
	}

	public UUID getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void incrementQuantity(int quantities) {
		this.quantity = quantity + quantities;

	}

}