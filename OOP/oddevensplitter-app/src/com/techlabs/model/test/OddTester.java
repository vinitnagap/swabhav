package com.techlabs.model.test;

import static org.junit.Assert.*;
import com.techlabs.model.*;

import org.junit.Test;

public class OddTester {

	@Test
	public void test_getOddNos_withInput8_return4OddNos() {
		Generator obj = new Generator();
		obj.oddEvenSplitter(8);
		int[] expected = { 1, 3, 5, 7 };
		int[] actual = new int[obj.getOddNumbers().size()];
		for (int i = 0; i < obj.getOddNumbers().size(); i++) {
			actual[i] = (int) obj.getOddNumbers().get(i);
		}
		assertArrayEquals(expected, actual);

	}

}
