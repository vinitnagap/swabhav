package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.model.Generator;

public class Test {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		Generator app = new Generator();
		app.oddEvenSplitter(number);
		printNumbers(app.getEvenNumbers(), "Even");
		printNumbers(app.getOddNumbers(), "Odd");

	}

	private static void printNumbers(ArrayList numbers, String type) {
		System.out.println(type);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();
	}
}
