package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
	static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
	static ArrayList<Integer> player2Positions = new ArrayList<Integer>();

	public static void main(String[] args) {

		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
		printGameBoard(gameBoard);
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Player 1 placement (1-9) : ");
			int player1Position = scan.nextInt();
			while (player1Positions.contains(player1Position)
					|| player2Positions.contains(player1Position)) {
				System.err.println("Enter correct position");
				player1Position = scan.nextInt();
			}

			placePiece(gameBoard, player1Position, "Player1");
			printGameBoard(gameBoard);
			String result = checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}

			System.out.println("Enter Player 2 placement (1-9) : ");
			int player2Position = scan.nextInt();
			while (player1Positions.contains(player2Position)
					|| player2Positions.contains(player2Position)) {
				System.err.println("Enter correct position");
				player2Position = scan.nextInt();
			}
			placePiece(gameBoard, player2Position, "Player2");
			printGameBoard(gameBoard);

			result = checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}
		}

	}

	public static void printGameBoard(char[][] gameBoard) {
		for (char[] rows : gameBoard) {
			for (char element : rows) {
				System.out.print(element);
			}
			System.out.println();
		}
	}

	public static void placePiece(char[][] gameBoard, int pos, String user) {

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

	public static String checkWinner() {
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);

		List<List> winningConditions = new ArrayList<List>();
		winningConditions.add(topRow);
		winningConditions.add(midCol);
		winningConditions.add(botRow);
		winningConditions.add(leftCol);
		winningConditions.add(midCol);
		winningConditions.add(rightCol);
		winningConditions.add(cross1);
		winningConditions.add(cross2);

		for (List l : winningConditions) {
			if (player1Positions.containsAll(l)) {
				return "Player 1 Wins";
			} else if (player2Positions.containsAll(l)) {
				return "Player 2 Wins";
			} else if (player1Positions.size() + player2Positions.size() == 9) {
				return "END";
			}

		}
		return "";
	}
}
