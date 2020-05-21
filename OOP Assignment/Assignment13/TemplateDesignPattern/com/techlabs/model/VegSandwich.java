package com.techlabs.model;

public class VegSandwich extends Sandwich {
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	protected boolean customerWantsMeat() {
		return false;
	}

	@Override
	protected boolean customerWantsCheese() {
		return false;
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

	@Override
	public void addMeat() {
	}

	@Override
	public void addCheese() {
	}

}
