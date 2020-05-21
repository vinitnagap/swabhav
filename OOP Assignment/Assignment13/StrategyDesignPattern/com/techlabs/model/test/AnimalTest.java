package com.techlabs.model.test;

import com.techlabs.model.Animal;
import com.techlabs.model.Bird;
import com.techlabs.model.Dog;

public class AnimalTest {

	public static void main(String[] args) {

		Animal oscar = new Dog("Oscar", 3.2, 42, "Chicken");
		Animal jill = new Bird("Jill", 2, 10, "Peanuts");

		System.out.println("Dog: " + oscar.tryToFly());

		System.out.println("Bird: " + jill.tryToFly());

	}

}
