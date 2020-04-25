package com.techlabs.test;

public class RuntimeExceptionStackTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("End of main");
	}

	public static void m1() {
		System.out.println("Inside m1");
		m2();
	}

	public static void m2() {
		System.out.println("Inside m2");
		m3();
	}

	public static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("Some Fata Error in m3");
	}

}
