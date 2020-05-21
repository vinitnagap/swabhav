package com.techlabs.model;

public abstract class Sandwich {
	boolean afterFirstCondiment = false;

	public final void makeSandwich() {

		cutBun();

		if (customerWantsMeat()) {

			addMeat();

			afterFirstCondiment = true;

		}

		if (customerWantsCheese()) {

			if (afterFirstCondiment) {
				System.out.print("\n");
			}

			addCheese();

			afterFirstCondiment = true;

		}

		if (customerWantsVegetables()) {

			if (afterFirstCondiment) {
				System.out.print("\n");
			}

			addVegetables();

			afterFirstCondiment = true;

		}

		if (customerWantsCondiments()) {

			if (afterFirstCondiment) {
				System.out.print("\n");
			}

			addCondiments();

			afterFirstCondiment = true;

		}

		wrapSandwich();

	}

	public abstract void addMeat();

	public abstract void addCheese();

	public abstract void addVegetables();

	public abstract void addCondiments();

	public void cutBun() {

		System.out.println("Bun is Cut");

	}

	protected boolean customerWantsMeat() {
		return true;
	}

	protected boolean customerWantsCheese() {
		return true;
	}

	protected boolean customerWantsVegetables() {
		return true;
	}

	protected boolean customerWantsCondiments() {
		return true;
	}

	public void wrapSandwich() {

		System.out.println("\nWrap the Sandwich");

	}

}
