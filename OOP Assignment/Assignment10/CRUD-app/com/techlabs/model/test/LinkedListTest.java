package com.techlabs.model.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(5);

		numbers.remove(2);

		numbers.set(0, 6);
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
