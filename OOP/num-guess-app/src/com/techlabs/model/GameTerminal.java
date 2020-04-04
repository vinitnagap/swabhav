package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal {
	private String choice = "play";
	private int result;

	public void startGame() {
		Game newgame = new Game();
		newgame.generateRandomn();
		do {
			System.out.println("Guess the number");
			Scanner sc = new Scanner(System.in);
			newgame.guessNo(sc.nextInt());

			result = newgame.checkGuessedNo();
			switch (result) {
			case 1:
				System.out.println("Sorry, too high");
				break;
			case 2:
				System.out.println("Sorry, too low");
				break;
			case 3:
				System.out.println("Success \nNumber of guesses made : "
						+ newgame.getGuessMade());
				checkUserAnswer();
				newgame.generateRandomn();
				newgame.resetGuessMade();

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