package com.techlabs.basics;

public class OverloadingTest {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(0);
		System.out.println(20.22f);
		System.out.println('x');
		System.out.println("xyz");
		System.out.println(24.445);
		
		printInfo(20);
		printInfo(50.02);
		printInfo('t');
		printInfo(20.22f);
		printInfo("xyz");
	}

	private static void printInfo(int x) {
		System.out.println(x);
	}

	private static void printInfo(double d) {
		System.out.println(d);
	}

	private static void printInfo(char t) {
		System.out.println(t);
	}

	private static void printInfo(float f) {
		System.out.println(f);
	}

	private static void printInfo(String s) {
		System.out.println(s);
	}
}