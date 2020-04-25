package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.techlabs.model.Builder;
import com.techlabs.model.Guitar;
import com.techlabs.model.GuitarSpec;
import com.techlabs.model.Inventory;
import com.techlabs.model.Type;
import com.techlabs.model.Wood;

public class GuitarFinderTester {

	GuitarSpec guitar = null;
	Inventory inventory = new Inventory();
	boolean expected = true, actual = false;

	@Before
	public void setup() {
		inventory.addGuitar("45AB", 25000, new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 24, Wood.ALDER, Wood.ALDER));
		Guitar whatRamLikes = inventory.getGuitar("45AB");
		guitar = whatRamLikes.getSpec();
		System.out.println("Hello");
	}

	@Test
	public void test_checkNumberOfString_ForWhatRamLikes() {

		if (guitar.getNumStrings() == 24) {
			actual = true;
		}
		assertEquals(expected, actual);

	}

	@Test
	public void test_checkBuilderType_Fender_ForWhatRamLikes() {

		if (guitar.getBuilder() == Builder.FENDER) {
			actual = true;
		}
		assertEquals(expected, actual);

	}

	public void test_checkBackWood_Alder_ForWhatRamLikes() {

		if (guitar.getBackWood() == Wood.ALDER) {
			actual = true;
		}
		assertEquals(expected, actual);

	}

	public void test_checkTopWood_Alder_ForWhatRamLikes() {

		if (guitar.getTopWood() == Wood.ALDER) {
			actual = true;
		}
		assertEquals(expected, actual);

	}

	public void test_checkModel_Stratocastor_ForWhatRamLikes() {

		if (guitar.getModel() == "Stratocastor") {
			actual = true;
		}
		assertEquals(expected, actual);

	}

}