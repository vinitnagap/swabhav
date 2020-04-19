package com.techlabs.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.model.Game;

public class LowTestCase {

	@Test
	public void test_LowerInput() {
		Game obj = new Game();
		obj.generateRandomNo();
		int low = obj.getRandomNo() - 1;
		String actual = obj.checkGuessedNo(low);
		String expected = "LOW";
		assertEquals(expected, actual);
	}

}
