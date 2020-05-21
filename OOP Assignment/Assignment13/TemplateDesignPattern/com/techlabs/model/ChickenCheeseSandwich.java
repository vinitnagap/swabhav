package com.techlabs.model;

public class ChickenCheeseSandwich extends Sandwich {
	private String[] meatUsed = { "Chicken" };
	private String[] cheeseUsed = { "Mozzarella" };
	private String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions",
			"Sweet Peppers" };
	private String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	public void addMeat() {

		System.out.print("Adding the Meat: ");

		for (String meat : meatUsed) {

			System.out.print(meat + " ");

		}

	}

	@Override
	public void addCheese() {

		System.out.print("Adding the Cheese: ");

		for (String cheese : cheeseUsed) {

			System.out.print(cheese + " ");

		}

	}

	@Override
	public void addVegetables() {

		System.out.print("Adding the Vegetables: ");

		for (String vegetable : veggiesUsed) {

			System.out.print(vegetable + " ");

		}

	}

	@Override
	public void addCondiments() {

		System.out.print("Adding the Condiments: ");

		for (String condiment : condimentsUsed) {

			System.out.print(condiment + " ");

		}

	}

}
