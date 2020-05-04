package com.techlabs.model.test;

import java.util.ArrayList;

import com.techlabs.model.LineItem;

public class Test {

	public static void main(String[] args) {
		case1();
		case2();
	}

	private static void case1() {
		double totalCartPrice = 0;
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(101, "book", 10, 500));
		cart.add(new LineItem(102, "pen", 5, 50));
		cart.add(new LineItem(103, "pencil", 3, 10));
		cart.add("Swabhav");
		for (Object obj : cart) {
			if (obj instanceof LineItem) {
				LineItem item = (LineItem) obj;
				System.out.println("ID = " + item.getId() + " Price = "
						+ item.calculateTotal());
				totalCartPrice = totalCartPrice + item.calculateTotal();
			}

		}
		System.out.println("Total Cart Price = " + totalCartPrice);
	}

	private static void case2() {
		double totalCartPrice = 0;
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "book", 10, 500));
		cart.add(new LineItem(102, "pen", 5, 50));
		cart.add(new LineItem(103, "pencil", 3, 10));
		for (Object obj : cart) {
			LineItem item = (LineItem) obj;
			System.out.println("ID = " + item.getId() + " Price = "
					+ item.calculateTotal());
			totalCartPrice = totalCartPrice + item.calculateTotal();

		}
		System.out.println("Total Cart Price = " + totalCartPrice);
	}
}
