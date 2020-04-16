package com.techlabs.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.model.test.MyJUnitClass;

public class MultiplyTest {

	@Test
	public void Multiplytest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.multiply(20, 10);
		assertEquals(200, result);
	}

}
