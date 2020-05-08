package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(10, "ram");
		map.put(20, "om");
		map.put(30, "akash");
		map.put(20, "gopal");
		map.put(50, "rahul");

		map.replace(30, "ajay");

		map.remove(50);

		System.out.println(map.containsValue("ajay"));

		print(map);

		if (map.containsKey(20)) {
			String a = map.get(20);
			System.out.println("value for key" + " 20 is:- " + a);
		}

		map.clear();
		print(map);
	}

	public static void print(Map<Integer, String> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		}

		else {
			System.out.println(map);
		}
	}
}
