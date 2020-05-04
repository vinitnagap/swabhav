package com.techlabs.model.test;


import java.util.TreeSet;

import com.techlabs.model.LineItem;

public class Test {

	public static void main(String[] args) {
		case1();
		case2();
	}

	private static void case1() {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Swabhav");
		names.add("techlabs");
		names.add("techlabs");
		System.out.println(names.size());
	}

	private static void case2() {
		TreeSet<LineItem> items = new TreeSet<LineItem>();
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(101, "book", 10, 500));

		System.out.println(items.size());
	}
}
