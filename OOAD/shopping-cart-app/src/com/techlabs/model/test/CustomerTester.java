package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class CustomerTester {

	Product book = new Product(UUID.randomUUID(), "Book",20, 5);
	LineItem books = new LineItem(UUID.randomUUID(), 5, book);
	Order order1 = new Order(UUID.randomUUID(), "15/10/2008");

	Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "Mumbai");

	@Before
	public void setup() {
		order1.addItem(books);
		kishore.addOrder(order1);
	}

	@Test
	public void test_checkIfKishore_getName_isKishore() {
		String expected = "Kishore";
		String actual = kishore.getName();
		assertEquals(expected, actual);

	}

	@Test
	public void test_checkIfKishore_getAddress_isMumbai() {
		String expected = "Mumbai";
		String actual = kishore.getAddress();
		assertEquals(expected, actual);

	}

}
