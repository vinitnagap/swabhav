package com.techlabs.test;

public class ExceptionStackTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("End of main");
	}

	public static void m1() throws Exception {
		System.out.println("Inside m1");
		m2();
	}

	public static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}

	public static void m3() throws Exception {
		System.out.println("Inside m3");
		throw new Exception("Some Fata Error in m3");
	}

}
