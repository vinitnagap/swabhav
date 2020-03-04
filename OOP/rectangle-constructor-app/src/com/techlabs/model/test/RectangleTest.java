package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectangleTest {
	public static void main(String[] agrs) {
		Rectangle rect1 = new Rectangle(-10, 5, "green");
		printDetails(rect1);

		Rectangle rect2 = new Rectangle(-5, -2);
		printDetails(rect2);

		Rectangle rect3 = new Rectangle(0, 0, "Orange");
		printDetails(rect3);

		Rectangle rect4 = new Rectangle(10, 20, "BlUe");
		printDetails(rect4);

		Rectangle rect5 = new Rectangle(10, -20, null);
		printDetails(rect5);

	}

	private static void printDetails(Rectangle r) {
		System.out.println("Width = " + r.getWidth());
		System.out.println("Height = " + r.getHeight());
		System.out.println("Color = " + r.getColor());
		System.out.println("Area = " + r.calculateArea());
		System.out.println();
	}
}
