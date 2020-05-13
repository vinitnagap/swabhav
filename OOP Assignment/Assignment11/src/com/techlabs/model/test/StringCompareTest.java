package com.techlabs.model.test;

public class StringCompareTest {

	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1.compareToIgnoreCase(s2));
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		System.out.println(a.compareTo(b));
	}
}
