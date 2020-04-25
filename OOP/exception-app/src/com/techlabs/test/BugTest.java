package com.techlabs.test;

public class BugTest {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of input limit");
		} catch (NumberFormatException e) {
			System.out.println("Use only integer values");
		} finally {
			System.out.println("End of main");
		}
	}
}
