package com.techlabs.model;

import java.util.Comparator;

public class NameComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		return (item1.getName().compareToIgnoreCase(item2.getName()));

	}
}
