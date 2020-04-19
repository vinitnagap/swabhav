package com.techlabs.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.model.Generator;

public class EvenTester {

	@Test
	public void test_getEvenNos_withInput8_return5OddNos() {
		Generator obj = new Generator();
		obj.oddEvenSplitter(8);
		int[] expected = { 0, 2, 4, 6, 8 };
		int[] actual = new int[obj.getEvenNumbers().size()];
		for (int i = 0; i < obj.getEvenNumbers().size(); i++) {
			actual[i] = (int) obj.getEvenNumbers().get(i);
		}
		assertArrayEquals(expected, actual);

	}

}
