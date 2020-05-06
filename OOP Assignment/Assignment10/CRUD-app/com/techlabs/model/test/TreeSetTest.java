package com.techlabs.model.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String args[]) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();

		numbers.add(9);
		numbers.add(40);
		numbers.add(2);
		numbers.add(3);
		numbers.add(10);
		numbers.add(4);

		numbers.remove(3);

		numbers.add(9);

		for (Integer number : numbers) {
			if (number.equals(2)) {
				numbers.remove(2);
				numbers.add(12);
				break;
			}
		}

		Iterator itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(numbers.contains(9));
	}
}
