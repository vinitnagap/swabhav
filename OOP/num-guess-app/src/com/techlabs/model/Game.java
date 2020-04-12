package com.techlabs.model;

import java.util.Random;

public class Game {
	private int randomno;
	private int guesscount = 0;
	private int score = 100;

	public void generateRandomn() {
		Random random = new Random();
		randomno = random.nextInt(100);

	}

	public String checkGuessedNo(int guessno) {
		if (guessno > randomno) {

			guesscount++;
			score = score - 10;
			return "HIGH";
		} else if (guessno < randomno) {

			guesscount++;
			score = score - 10;
			return "LOW";
		}
		guesscount++;
		return "SUCCESS";

	}

	public void resetGuessMade() {
		guesscount = 0;

	}

	public int getGuessMade() {
		return guesscount;
	}

	public int calculateScore() {
		if (score < 10)
			return 5;
		return score;
	}

}