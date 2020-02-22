package com.techlab.circle.test;

import com.techlab.circle.*;

public class CircleTest {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];
		circles[0] = new Circle();
		circles[1] = new Circle();
		circles[2] = new Circle();
		circles[3] = new Circle();
		circles[4] = new Circle();
		
		circles[0].setRadius(4.2f);
		circles[1].setRadius(2.3f);
		circles[2].setRadius(1.3f);
		circles[3].setRadius(4.6f);
		circles[4].setRadius(5.9f);
		
		printInfo(circles);
		
		Circle big = findLargestCircle(circles);
		System.out.println("Large circle = " + big);

		Circle small = findSmallestCircle(circles);
		System.out.println("Smallest circle = " + small);
		
		System.out.println(findLargestCircle(circles).getRadius());
		printInfo(findSmallestCircle(circles));
	}

	public static void printInfo(Circle[] circles) {
		for (Circle cir : circles) {
			printInfo(cir);

		}
	}

	public static void printInfo(Circle c) {
		System.out.println("Radius = " + c.getRadius());
		System.out.println("Area = " + c.calculateArea());
		System.out.println("Perimeter = " + c.calculatePerimeter());
	}

	public static Circle findLargestCircle(Circle[] circles) {
		Circle big = null;
		float radius = circles[0].getRadius();
		for (int i = 0; i < 5; i++) {
			if (radius < circles[i].getRadius()) {
				big = circles[i];
			}
		}
		return big;
	}

	public static Circle findSmallestCircle(Circle[] circles) {
		Circle small = null;
		float radius = circles[0].getRadius();
		for (int i = 0; i < 5; i++) {
			if (radius > circles[i].getRadius()) {
				small = circles[i];
			}
		}
		return small;
	}

	/*
	 * public static float findSmallestCircle(Circle[] circles) { float small =
	 * circles[0].getRadius(); for (int i = 0; i < 5; i++) { if (small >
	 * circles[i].getRadius()) { small = circles[i].getRadius(); } } return
	 * small; }
	 */
	/*
	 * public static void bubbleSort(Circle[] circles) { int n = circles.length;
	 * for (int i = 0; i < n - 1; i++) for (int j = 0; j < n - i - 1; j++) if
	 * (circles[j].getRadius() > circles[j + 1].getRadius()) { float temp =
	 * circles[j].getRadius(); circles[j].setRadius(circles[j + 1].getRadius());
	 * circles[j + 1].setRadius(temp); } }
	 */
}
