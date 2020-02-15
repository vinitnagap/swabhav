package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		System.out.println("Small Rectangle");
		small.width = 10;
		small.height = 5;
		System.out.println("Width = " + small.width + " Height = "
				+ small.height);
		System.out.println("Area = " + small.calculateArea());
		
		Rectangle big = new Rectangle();
		System.out.println("Big Rectangle");
		big.width = 100;
		big.height = 50;
		System.out.println("Width = " + big.width + " Height = " + big.height);
		System.out.println("Area = " + big.calculateArea());
	}
}
