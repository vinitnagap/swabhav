package com.techlabs.model;

import java.util.Random;

public class Game {
	private int randomno;
	private int guesscount = 0;

	public void generateRandomn() {
		Random random = new Random();
		randomno = random.nextInt(100);

	}

	public String checkGuessedNo(int guessno) {
		if (guessno > randomno) {

			guesscount++;
			return "HIGH";
		} else if (guessno < randomno) {

			guesscount++;
			return "LOW";
		}
		guesscount++;
		return "SUCCESS";

	}

	public int getScore() {
		if (guesscount == 1) {
			return 100;
		} else if (guesscount == 2) {
			return 90;
		} else if (guesscount == 3) {
			return 80;
		} else if (guesscount == 4) {
			return 70;
		} else if (guesscount == 5) {
			return 60;
		} else if (guesscount == 6) {
			return 50;
		} else if (guesscount == 7) {
			return 40;
		} else if (guesscount == 8) {
			return 30;
		} else if (guesscount == 9) {
			return 20;
		}
		return 5;
	}

	public void resetGuessMade() {
		guesscount = 0;

	}

	public int getGuessMade() {
		return guesscount;
	}

}