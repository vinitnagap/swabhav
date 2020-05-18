package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

public class LineItemTester {

	Product book = new Product(UUID.randomUUID(), "Book", 100, 50);
	LineItem books = new LineItem(UUID.randomUUID(), 6, book);

	@Test
	public void test_checkIfBook_getQuantity_Is6() {
		int expected = 6;
		int actual = books.getQuantity();
		assertEquals(expected, actual);
	}

	@Test
	public void test_checkIfBook_getProduct_equalsBook() {
		Product actual = book;
		Product expected = books.getProduct();
		assertEquals(expected, actual);

	}

	@Test
	public void test_checkIfBook_calculateItemCost_Is300() {
		double expected = 300;
		double actual = books.calculateItemCost();
		assertEquals(expected, actual, .0);
	}

}
