package com.techlabs.model;

import java.util.Scanner;

public class GameUI {
	public char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
			{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
			{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

	public void printGameBoard(char[][] gameBoard) {
		for (char[] rows : gameBoard) {
			for (char element : rows) {
				System.out.print(element);
			}
			System.out.println();
		}
	}

	public int getPlayerPosition() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	public void checkPosition() {
		while (true) {
			GameTerminal terminal = new GameTerminal();
			System.out.println("Enter Player 1 placement (1-9) : ");
			int player1Turn = getPlayerPosition();
			while (terminal.getPlayer1Positions().contains(player1Turn)
					|| terminal.getPlayer2Positions().contains(player1Turn)) {
				System.err.println("Enter correct position");
				player1Turn = getPlayerPosition();
			}

			terminal.placePiece(gameBoard, player1Turn, "Player1");
			printGameBoard(gameBoard);
			String result = terminal.checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}

			System.out.println("Enter Player 2 placement (1-9) : ");
			int player2Turn = getPlayerPosition();
			while (terminal.getPlayer1Positions().contains(player2Turn)
					|| terminal.getPlayer2Positions().contains(player2Turn)) {
				System.err.println("Enter correct position");
				player2Turn = getPlayerPosition();
			}
			terminal.placePiece(gameBoard, player2Turn, "Player2");
			printGameBoard(gameBoard);

			result = terminal.checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}
		}
	}
}
