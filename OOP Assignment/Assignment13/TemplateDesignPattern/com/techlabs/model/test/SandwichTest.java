package com.techlabs.model.test;

import com.techlabs.model.ChickenCheeseSandwich;
import com.techlabs.model.Sandwich;
import com.techlabs.model.VegSandwich;

public class SandwichTest {

	public static void main(String[] args) {
		Sandwich customer1 = new VegSandwich();
		customer1.makeSandwich();
		System.out.println();

		Sandwich customer2 = new ChickenCheeseSandwich();
		customer2.makeSandwich();

	}
}
