package com.techlabs.model.test;

import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class Test {

	public static void main(String[] args) throws ParseException {
		Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "Mumbai");
		Customer vishal = new Customer(UUID.randomUUID(), "Vishal", "Panvel");

		Product book = new Product(UUID.randomUUID(), "Book", 30, 5);
		Product pen = new Product(UUID.randomUUID(), "Pen", 10, 0);
		Product ruler = new Product(UUID.randomUUID(), "Ruler", 40, 20);
		Product bag = new Product(UUID.randomUUID(), "Bag", 500, 20);
		Product mobile = new Product(UUID.randomUUID(), "Mobile", 20000, 40);

		LineItem books = new LineItem(UUID.randomUUID(), 20, book);
		LineItem pens = new LineItem(UUID.randomUUID(), 200, pen);
		LineItem rulers = new LineItem(UUID.randomUUID(), 20, ruler);
		LineItem bags = new LineItem(UUID.randomUUID(), 50, bag);
		LineItem mobiles = new LineItem(UUID.randomUUID(), 2, mobile);

		Order Order1 = new Order(UUID.randomUUID(), "20/01/2010");
		Order1.addItem(books);
		Order1.addItem(pens);
		Order1.addItem(rulers);

		Order Order2 = new Order(UUID.randomUUID(), "15/10/2019");
		Order2.addItem(bags);
		Order2.addItem(mobiles);

		kishore.addOrder(Order1);
		kishore.addOrder(Order2);

		printInfo(kishore);

	}

	private static void printInfo(Customer customer) {
		System.out.println("Customer ID : " + customer.getId()
				+ " Customer Name : " + customer.getName()
				+ " Customer Address : " + customer.getAddress());
		System.out.println("Order Details : ");
		for (Order order : customer.getOrders()) {
			System.out.println("Id : " + order.getId() + " Items : "
					+ order.getItems() + " Total Cost : "
					+ order.checkoutCost());
		}
	}
}
