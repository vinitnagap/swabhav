package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(5);

		numbers.remove(2);

		numbers.set(0, 6);
		numbers.add(9);

		Iterator itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(numbers.contains(9));
	}
}
