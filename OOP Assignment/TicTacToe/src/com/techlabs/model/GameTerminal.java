package com.techlabs.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameTerminal {

	private static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
	private static ArrayList<Integer> player2Positions = new ArrayList<Integer>();

	public void startGame() {
		GameUI newGame = new GameUI();
		newGame.printGameBoard(newGame.gameBoard);
		newGame.checkPosition();

	}

	public void placePiece(char[][] gameBoard, int pos, String user) {

		char symbol = ' ';
		if (user.equalsIgnoreCase("Player1")) {
			symbol = 'X';
			player1Positions.add(pos);
		} else if (user.equalsIgnoreCase("Player2")) {
			symbol = 'O';
			player2Positions.add(pos);
		}

		switch (pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;
		}
	}

	public String checkWinner() {
		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> midRow = Arrays.asList(4, 5, 6);
		List<Integer> botRow = Arrays.asList(7, 8, 9);
		List<Integer> leftCol = Arrays.asList(1, 4, 7);
		List<Integer> midCol = Arrays.asList(2, 5, 8);
		List<Integer> rightCol = Arrays.asList(3, 6, 9);
		List<Integer> cross1 = Arrays.asList(1, 5, 9);
		List<Integer> cross2 = Arrays.asList(7, 5, 3);

		List<List<Integer>> winningConditions = new ArrayList<List<Integer>>();
		winningConditions.add(topRow);
		winningConditions.add(midRow);
		winningConditions.add(botRow);
		winningConditions.add(leftCol);
		winningConditions.add(midCol);
		winningConditions.add(rightCol);
		winningConditions.add(cross1);
		winningConditions.add(cross2);

		for (List<Integer> l : winningConditions) {
			if (player1Positions.containsAll(l)) {
				return "Player 1 Wins";
			} else if (player2Positions.containsAll(l)) {
				return "Player 2 Wins";
			}

		}
		if (player1Positions.size() + player2Positions.size() == 9) {
			return "Draw";
		}
		return "";
	}

	public List<Integer> getPlayer1Positions() {
		return player1Positions;
	}

	public List<Integer> getPlayer2Positions() {
		return player2Positions;
	}
}
