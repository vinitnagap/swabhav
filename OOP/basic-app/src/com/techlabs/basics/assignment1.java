package com.techlabs.basics;

public class assignment1 {

	public static void main(String[] args) {

		String str = "http://www.swabhavtechlabs.com?developer=vinit&role=architect";
		String[] terms = str.split("[@&?$+-]+");
		System.out.println("Website = " + terms[0]);
		System.out.println("" + terms[1]);
		System.out.println("" + terms[2]);

		// String[] parts = str.split("?");
		// String company = parts[20];
		// System.out.println(company);

	}
}
