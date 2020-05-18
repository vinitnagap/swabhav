package com.techlabs.model;

import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {

	public CsvWriter(Customer customer) throws IOException {
		FileWriter fw = new FileWriter("ShoppingCartDetials.csv");
		double totalCost = 0;
		fw.write("Customer ID : " + customer.getId() + " Customer Name : "
				+ customer.getName() + " Customer Address : "
				+ customer.getAddress());
		fw.write("\nOrder Details : ");
		for (Order order : customer.getOrders()) {
			fw.write("\nId : " + order.getId() + " Total Cost : "
					+ order.checkoutCost());
			fw.write("\nList of Products : ");
			for (LineItem item : order.getItems()) {
				fw.write("\nId : " + item.getId() + " Product : "
						+ item.getProduct().getName() + " Quantity : "
						+ item.getQuantity());
			}
			totalCost = totalCost + order.checkoutCost();
		}
		fw.write("\nTotal Amount : " + totalCost);
		fw.close();
		System.out.println("\nFile created with name ShoppingCartDetials.csv");
	}
}
