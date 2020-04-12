package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal {
	private String choice = "play";
	private String result;

	public void playGame() {
		Game newgame = new Game();
		newgame.generateRandomn();
		System.out.println(" \t \t Status:Not Started");
		do {
			System.out.println("Guess the number");
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			result = newgame.checkGuessedNo(no);
			switch (result) {
			case "HIGH":
				System.out.println("Sorry, Too High \t\t Status:In Progress");
				break;
			case "LOW":
				System.out.println("Sorry, Too Low \t\t Status:In Progress");
				break;

			case "SUCCESS":

				System.out.println("Success \nNumber of guesses made : "
						+ newgame.getGuessMade());
				System.out.println("Score = " + newgame.getScore()
						+ "\t\t Status :Has Result");
				checkUserAnswer();
				newgame.generateRandomn();
				newgame.resetGuessMade();
				break;

			}

		} while (this.choice == "play");
	}

	public void checkUserAnswer() {

		System.out.println("Do you want to play again?");
		System.out.println("Enter play or exit");
		Scanner sc = new Scanner(System.in);
		String decission = sc.next();
		switch (decission) {
		case "exit":
			choice = "exit";
			break;
		case "play":
			choice = "play";
			break;
		}
	}

}