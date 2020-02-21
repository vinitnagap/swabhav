package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectangleArrayOfObjectTest {

	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = new Rectangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		rectangles[1] = r1;
		rectangles[2] = r2;
		rectangles[0].changeWidth(10);
		rectangles[0].changeHeight(50);
		r1.changeWidth(20);
		r1.changeHeight(50);
		r2.changeWidth(5);
		r2.changeHeight(10);
		printInfo(rectangles);

	}

	// CASE I
	/*
	 * public static void printInfo(Rectangle[] rec) { for (Rectangle a : rec) {
	 * System.out.println("Height = " + a.readHeight());
	 * System.out.println("Weight = " + a.readWidth());
	 * 
	 * } }
	 */

	// CASE II
	public static void printInfo(Rectangle[] rec) {
		for (Rectangle a : rec) {
			printInfo(a);
		}
	}

	public static void printInfo(Rectangle r) {
		System.out.println("Width = " + r.readWidth());
		System.out.println("Height = " + r.readHeight());
	}
}
