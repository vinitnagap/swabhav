package com.techlabs.model;

import java.util.Random;

public class Game {
	private int guessno;
	private int randomnum;
	private int guessesmade = 0;

	public void generateRandomn() {
		Random rn = new Random();
		randomnum = rn.nextInt(100);

	}

	public void guessNo(Integer guessno) {

		this.guessno = guessno;
	}

	public int checkGuessedNo() {
		if (guessno > randomnum) {

			incrementguessMade();
			return 1;
		}
		if (guessno < randomnum) {

			incrementguessMade();
			return 2;
		} else if (guessno == randomnum) {
			incrementguessMade();

			return 3;
		}
		return 0;
	}

	public void incrementguessMade() {
		guessesmade++;
	}

	public void resetGuessMade() {
		guessesmade = 0;

	}

	public int getGuessMade() {
		return guessesmade;
	}

}