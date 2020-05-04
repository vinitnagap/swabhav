package com.techlabs.model.test;

import java.util.TreeSet;

import com.techlabs.model.LineItem;
import com.techlabs.model.NameComparator;
import com.techlabs.model.PriceComparator;
import com.techlabs.model.QuantityComparator;

public class TestNew {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
	}

	private static void case1() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new NameComparator());
		items.add(new LineItem(101, "pen", 1000, 500));
		items.add(new LineItem(101, "book", 100, 500));

		for (LineItem item : items) {
			System.out.println("ID = " + item.getId() + " Name = "
					+ item.getName() + " Price = " + item.getPrice()
					+ " Quantity = " + item.getQuantity());

		}
	}

	private static void case2() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new PriceComparator());
		items.add(new LineItem(101, "book", 1000, 500));
		items.add(new LineItem(101, "book", 100, 500));

		for (LineItem item : items) {
			System.out.println("ID = " + item.getId() + " Name = "
					+ item.getName() + " Price = " + item.getPrice()
					+ " Quantity = " + item.getQuantity());

		}
	}

	private static void case3() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(
				new QuantityComparator());
		items.add(new LineItem(101, "book", 1000, 5000));
		items.add(new LineItem(101, "book", 100, 500));

		for (LineItem item : items) {
			System.out.println("ID = " + item.getId() + " Name = "
					+ item.getName() + " Price = " + item.getPrice()
					+ " Quantity = " + item.getQuantity());

		}
	}
}
