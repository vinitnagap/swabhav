package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleRefTest {
	public static void main(String[] args) {
		Rectangle small=null; // Small expects an object
		System.out.println(small);
		small = new Rectangle();
		System.out.println(small);
		small.height = 50;
		small.width = 10;
		System.out.printf("Width = %d, Height = %d, Area = %d", small.width,small.height, small.calculateArea());
	}
}
