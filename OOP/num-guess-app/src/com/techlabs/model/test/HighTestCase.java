package com.techlabs.model.test;

import com.techlabs.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class HighTestCase {

	@Test
	public void test_highInput() {
		Game obj = new Game();
		obj.generateRandomNo();
		int high = obj.getRandomNo() + 1;
		String actual = obj.checkGuessedNo(high);
		String expected = "HIGH";
		assertEquals(expected, actual);
	}

}
