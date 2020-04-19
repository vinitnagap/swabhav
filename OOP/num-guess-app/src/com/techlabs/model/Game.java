package com.techlabs.model;

import java.util.Random;

public class Game {
	private int randomNo;
	private int guesscount = 0;
	private int score = 100;

	public void generateRandomNo() {
		Random random = new Random();
		randomNo = random.nextInt(101);

	}

	public String checkGuessedNo(int guessno) {
		if (guessno > randomNo) {

			guesscount++;
			score = score - 10;
			return "HIGH";
		} else if (guessno < randomNo) {

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

	public int getRandomNo() {
		return randomNo;
	}
}