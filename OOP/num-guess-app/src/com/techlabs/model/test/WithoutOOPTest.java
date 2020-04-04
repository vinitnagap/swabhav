package com.techlabs.model.test;
import java.util.Random;
import java.util.Scanner;

public class WithoutOOPTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice 1. Play   2.Exit");
		int choice = input.nextInt();

		Random rand = new Random();
		int numberToGuess = rand.nextInt(101);
		int numberOfTries = 0;

		int guess;
		boolean win = false;
		switch (choice) {

		case 1:
			while (win == false) {
				System.out.println("Guess no. between 1 to 100:");
				guess = input.nextInt();
				numberOfTries++;

				if (guess == numberToGuess) {
					win = true;
				} else if (guess < numberToGuess) {
					System.out.println("Sorry,Too low");
				} else if (guess > numberToGuess) {
					System.out.println("Sorry,Too high");
				}
			}

			System.out.println("You win");
			System.out.println("No. of attempts = " + numberOfTries);
			break;
		case 2:
			break;

		}
		input.close();
	}

}
