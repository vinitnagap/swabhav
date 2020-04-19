package com.techlabs.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.model.Game;

public class SuccessTestCase {

	@Test
	public void test_equalInput() {
		Game obj = new Game();
		obj.generateRandomNo();
		int equal = obj.getRandomNo();
		String actual = obj.checkGuessedNo(equal);
		String expected = "SUCCESS";
		assertEquals(expected, actual);
	}

}
