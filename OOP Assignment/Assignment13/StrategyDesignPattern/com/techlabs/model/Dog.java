package com.techlabs.model;

public class Dog extends Animal {

	public Dog(String name, double height, double weight, String favFood) {

		super(name, height, weight, favFood);

		flyingType = new CantFly();

	}

}
