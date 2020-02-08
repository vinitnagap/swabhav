package com.techlabs.basics;

public class SumAndAverageTest {

	public static void main(String[] numbers) {

		int count = 0;
		if (numbers.length == 0) {
			System.out.println("No numbers inserted");
			return;
		}
		/*
		 * for (String num : numbers) { int no = Integer.parseInt(num);
		 * System.out.print(no + " "); } System.out.println(); int sum =
		 * sumOfNumbers(numbers); System.out.println("Sum = " + sum); int
		 * average = sum / numbers.length; System.out.println("Average = " +
		 * average);
		 */

		if (numbers[(numbers.length) - 1].contains("-even")) {
			for (int i = 0; i < (numbers.length) - 1; i++) {
				int no = Integer.parseInt(numbers[i]);
				if (no % 2 == 0) {
					System.out.print(no + " ");
					count++;
				}
			}
			System.out.println();
			int sum = evenSum(numbers);
			System.out.println("Even sum= " + sum);
			int average = sum / count;
			System.out.println("Average = " + average);
		} else if (numbers[(numbers.length) - 1].contains("-odd")) {
			for (int i = 0; i < (numbers.length) - 1; i++) {
				int no = Integer.parseInt(numbers[i]);
				if (no % 2 != 0) {
					System.out.print(no + " ");
					count++;
				}
			}
			System.out.println();
			int sum = oddSum(numbers);
			System.out.println("Odd sum= " + sum);
			int average = sum / count;
			System.out.println("Average = " + average);
		}
		/*
		 * else if (numbers[(numbers.length) - 1].contains("-prime")) { for (int
		 * i = 0; i < (numbers.length) - 1; i++) { int no =
		 * Integer.parseInt(numbers[i]); System.out.print(no+" "); }
		 * System.out.println(); int sum = primeSum(numbers);
		 * System.out.println("Prime sum= " + sum); int average = sum /
		 * ((numbers.length) - 1); System.out.println("Average = " + average); }
		 */

		else {
			for (String num : numbers) {
				int no = Integer.parseInt(num);
				System.out.print(no + " ");
			}
			System.out.println();

			int sum = sumOfNumbers(numbers);
			System.out.println("Sum = " + sum);
			int average = sum / numbers.length;
			System.out.println("Average = " + average);
		}

	}

	public static int sumOfNumbers(String numbers[]) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			int a = Integer.parseInt(numbers[i]);
			sum = sum + a;
		}
		return sum;
	}

	public static int evenSum(String numbers[]) {
		int sum = 0;
		for (int i = 0; i < (numbers.length) - 1; i++) {
			int a = Integer.parseInt(numbers[i]);
			if (a % 2 == 0) {
				sum = sum + a;
			}
		}
		return sum;
	}

	public static int oddSum(String numbers[]) {
		int sum = 0;
		for (int i = 0; i < (numbers.length) - 1; i++) {
			int a = Integer.parseInt(numbers[i]);
			if (a % 2 != 0) {
				sum = sum + a;
			}
		}
		return sum;
	}
}