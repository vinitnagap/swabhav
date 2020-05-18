package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.CsvWriter;
import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "Mumbai");
		Customer vishal = new Customer(UUID.randomUUID(), "Vishal", "Panvel");

		Product book = new Product(UUID.randomUUID(), "Book", 30, 0);
		Product pen = new Product(UUID.randomUUID(), "Pen", 10, 0);
		Product ruler = new Product(UUID.randomUUID(), "Ruler", 40, 0);
		Product bag = new Product(UUID.randomUUID(), "Bag", 500,0);
		Product mobile = new Product(UUID.randomUUID(), "Mobile", 20000, 0);

		LineItem books = new LineItem(UUID.randomUUID(), 20, book);
		LineItem pens = new LineItem(UUID.randomUUID(), 200, pen);
		LineItem rulers = new LineItem(UUID.randomUUID(), 20, ruler);
		LineItem bags = new LineItem(UUID.randomUUID(), 50, bag);
		LineItem mobiles = new LineItem(UUID.randomUUID(), 2, mobile);

		Order order1 = new Order(UUID.randomUUID(), "20/01/2010");
		order1.addItem(books);
		order1.addItem(pens);
		order1.addItem(rulers);

		Order order2 = new Order(UUID.randomUUID(), "15/10/2019");
		order2.addItem(bags);
		order2.addItem(mobiles);
		order2.addItem(mobiles);

		kishore.addOrder(order1);
		kishore.addOrder(order2);

		printInfo(kishore);
		new CsvWriter(kishore);

	}

	private static void printInfo(Customer customer) {
		double totalCost = 0;
		System.out.println("Customer ID : " + customer.getId()
				+ " Customer Name : " + customer.getName()
				+ " Customer Address : " + customer.getAddress());
		System.out.println("Order Details : ");
		for (Order order : customer.getOrders()) {
			System.out.println("\nId : " + order.getId() + " Total Cost : "
					+ order.checkoutCost());
			System.out.println("List of Products : ");
			for (LineItem item : order.getItems()) {
				System.out.println("Id : " + item.getId() + " Product : "
						+ item.getProduct().getName() + " Quantity : "
						+ item.getQuantity());
			}
			totalCost = totalCost + order.checkoutCost();
		}
		System.out.println("Total Amount : " + totalCost);
	}

}
