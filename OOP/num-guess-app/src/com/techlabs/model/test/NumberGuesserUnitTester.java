package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.techlabs.model.Game;

public class NumberGuesserUnitTester {

	Game obj = new Game();

	@Before
	public void setup() {
		obj.generateRandomNo();
	}

	@Test
	public void test_highInput() {
		int high = obj.getRandomNo() + 1;
		String actual = obj.checkGuessedNo(high);
		String expected = "HIGH";
		assertEquals(expected, actual);
	}

	@Test
	public void test_LowerInput() {
		int low = obj.getRandomNo() - 1;
		String actual = obj.checkGuessedNo(low);
		String expected = "LOW";
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalInput() {
		int equal = obj.getRandomNo();
		String actual = obj.checkGuessedNo(equal);
		String expected = "SUCCESS";
		assertEquals(expected, actual);
	}

}
