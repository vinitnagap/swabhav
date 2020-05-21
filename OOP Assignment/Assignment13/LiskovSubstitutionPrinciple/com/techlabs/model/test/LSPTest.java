package com.techlabs.model.test;

import com.techlabs.model.Rectangle;
import com.techlabs.model.Square;

public class LSPTest {

	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println("Area of Square : " + square.getArea());

		Rectangle rectangle = new Rectangle(20, 10);
		System.out.println("Area of Rectangle : " + rectangle.getArea());

	}

}
