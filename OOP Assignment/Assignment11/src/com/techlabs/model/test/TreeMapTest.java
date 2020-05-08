package com.techlabs.model.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(6, "Vinit");
		students.put(12, "Jay");
		students.put(5, "Prasad");
		students.put(78, "Murtaza");
		students.put(10, "Pawan");
		students.put(67, "Tejashree");
		students.put(1, "Tanmay");

		Iterator<Integer> it = students.keySet().iterator();
		System.out.println("Before Sorting");
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Roll no:  " + key + "     name:   "
					+ students.get(key));
		}

		Map<Integer, String> map = sortValues(students);
		System.out.println("\n");
		System.out.println("After Sorting:");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry student = (Map.Entry) iterator.next();
			System.out.println("Roll no:  " + student.getKey()
					+ "     Name:   " + student.getValue());
		}
	}

	private static HashMap sortValues(TreeMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}
