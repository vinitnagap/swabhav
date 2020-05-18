package com.techlabs.model.test;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.techlabs.model.Product;

public class ProductTester {

	Product book = new Product(UUID.randomUUID(), "Book", 100, 50);

	@Test
	public void test_checkIfBook_getNameIs_Book() {
		String expected = "Book";
		String actual = book.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_checkIfBook_getPrice_Is100() {
		double expected = 100;
		double actual = book.getPrice();
		assertEquals(expected, actual, .0);
	}

	@Test
	public void test_checkIfBook_getDiscountedPercentage_Is50() {
		float expected = 50;
		float actual = book.getDiscountPercentage();
		assertEquals(expected, actual, .0);
	}

	@Test
	public void test_checkIfBook_totalCost_Is50() {
		double expected = 50;
		double actual = book.totalCost();
		assertEquals(expected, actual, .0);
	}
}
