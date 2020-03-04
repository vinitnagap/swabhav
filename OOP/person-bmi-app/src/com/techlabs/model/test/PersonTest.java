package com.techlabs.model.test;

import com.techlabs.model.*;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(5.9f, 71.23f);
		printInfo(p1);

		Person p2 = new Person(5.9f, 96f);
		printInfo(p2);
	}

	private static void printInfo(Person p) {
		System.out.println("Height = " + p.getHeight());
		System.out.println("Weight = " + p.getWeight());
		System.out.println("BMI = " + p.calculateBmi());
		System.out.println("Type = " + p.bmiCategory());
		System.out.println();
	}
}
