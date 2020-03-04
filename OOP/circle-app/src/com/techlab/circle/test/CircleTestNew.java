package com.techlab.circle.test;

import com.techlab.circle.*;
import java.lang.reflect.*;

public class CircleTestNew {
	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		System.out.println(circles[0]);
		circles[0] = new Circle();
		displayMethods(Circle.class);
		System.out.println();
		displayMethods(CircleTest.class);
		System.out.println();
		displayMethods(Integer.class);
		System.out.println();
		displayMethods(CircleTestNew.class);
		System.out.println(new Circle().calculateArea());

	}

	public static void displayMethods(Class cir) {
		Method[] methods = cir.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println(methods.length);
	}

}
