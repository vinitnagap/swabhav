package com.techlabs.model.test;

import java.util.*;
import com.techlabs.model.*;

public class FindGuitarTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatRamLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 18, Wood.ALDER, Wood.ALDER);
		List matchingGuitars = (List) (inventory.search(whatRamLikes));
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Ram, you might like this guitars:");

			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println(spec.getBuilder() + " " + spec.getModel()
						+ " " + spec.getType() + " guitar\n"
						+ spec.getBackWood() + " back and sides,\n"
						+ spec.getTopWood() + " top\nYou have it for only Rs."
						+ guitar.getPrice() + "\n");

			}
		} else {
			System.out.println("Sorry, not found");

		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("12EW", 25000, new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 18, Wood.ALDER, Wood.ALDER));

		inventory.addGuitar("65AB", 76000, new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 18, Wood.ALDER, Wood.ALDER));

		inventory.addGuitar("89NM", 175500, new GuitarSpec(Builder.GIBSON,
				"Stratocastor", Type.ACOUSTIC, 18, Wood.INDIAN_ROSEWOOD,
				Wood.ALDER));
	}
}
