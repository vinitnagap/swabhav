package com.techlabs.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void Concattest() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.ConCat("abc", "def");
		assertEquals("abcdef", result);

	}

}
