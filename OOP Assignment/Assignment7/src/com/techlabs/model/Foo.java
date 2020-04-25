package com.techlabs.model;

public class Foo {

	@BeforeEveryUnitTest
	public void bar() {
		System.out.println("Before Unit Test Case");
	}

	@UnitTestCase
	public boolean m1() {
		return true; // passing testcase
	}

	public boolean m2() {
		return true; // not a testcase
	}

	@UnitTestCase
	public boolean m3() {
		return false; // failing testcase
	}

	@UnitTestCase
	public boolean m4() {
		return true; // passing testcase
	}
}
