package com.techlabs.model.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.techlabs.model.Builder;
import com.techlabs.model.Guitar;
import com.techlabs.model.GuitarSpec;
import com.techlabs.model.Inventory;
import com.techlabs.model.Type;
import com.techlabs.model.Wood;

public class GuitarFinderTester {

	@Test
	public void test() {
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
	}

}
