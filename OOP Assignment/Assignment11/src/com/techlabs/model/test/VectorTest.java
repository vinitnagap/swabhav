package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] arg) {

		Vector<Integer> v = new Vector<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(5);
		v.add(3);

		arr.add(3);
		arr.add(6);
		arr.add(2);
		arr.add(4);

		v.addAll(arr);

		System.out.println(v.lastElement());

		System.out.println("Vector is " + v);
	}
}
