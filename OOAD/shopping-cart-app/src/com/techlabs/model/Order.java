package com.techlabs.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {

	private UUID id;
	private Date date;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Order(UUID id, String date) {
		try {
			this.id = id;
			SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
			this.date = sdf.parse(date);
		} catch (Exception e) {

		}
	}

	public void addItem(LineItem lineItem) {
		if (this.getItems().contains(lineItem)) {
			int index = this.getItems().indexOf(lineItem);
			this.getItems().get(index).incrementQuantity(lineItem.getQuantity());

		} else {
			items.add(lineItem);
		}
	}

	public double checkoutCost() {
		double totalCost = 0;
		for (LineItem item : items) {
			totalCost = totalCost + item.calculateItemCost();
		}
		return totalCost;
	}

	public UUID getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

}
