package com.techlabs.model.test;

import com.techlabs.model.*;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("xyz", 50, GenderType.MALE, 6.5f, 100f);
		printInfo(p1);
		p1.doWorkout();
		System.out.println("After Workout = " + p1.getWeight());
		p1.doEat();
		System.out.println("After Eatting Weight = " + p1.getWeight());

		Person p2 = new Person(null, 0, GenderType.OTHER, 0f, 0f);
		printInfo(p2);
	}

	private static void printInfo(Person p) {
		System.out.println("Name = " + p.getName());
		System.out.println("Age = " + p.getAge());
		System.out.println("Gender = " + p.getGender());
		System.out.println("Height = " + p.getHeight());
		System.out.println("Weight = " + p.getWeight());
		System.out.println();
	}
}
