package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTest {
	public static void main(String args[]) {
		HashSet<Integer> numbers = new HashSet<Integer>();

		numbers.add(1);
		numbers.add(22);
		numbers.add(22);
		numbers.add(5);

		numbers.remove(5);

		numbers.add(90);

		for (Integer number : numbers) {
			if (number.equals(22)) {
				numbers.remove(22);
				numbers.add(12);
				break;
			}
		}

		// Collections.sort(numbers);

		Iterator itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<Integer> list = new ArrayList<Integer>(numbers);
		Collections.sort(list);

		System.out.println("HashSet elements " + "in sorted order "
				+ "using List: " + list);
		System.out.println(numbers.contains(90));

	}
}
