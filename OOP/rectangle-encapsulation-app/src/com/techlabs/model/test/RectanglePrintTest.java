package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectanglePrintTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		System.out.println("Rectangle r1 Info");
		r1.changeWidth(5);
		r1.changeHeight(10);
		printInfo(r1);

		System.out.println("Rectangle r2 Info");
		r2.changeWidth(50);
		r2.changeHeight(100);
		printInfo(r2);
	}

	public static void printInfo(Rectangle r) {
		System.out.println("Width = " + r.readWidth());
		System.out.println("Height = " + r.readHeight());
		int Area = r.readWidth() * r.readHeight();
		System.out.println("Area = "+Area);
	}
}
