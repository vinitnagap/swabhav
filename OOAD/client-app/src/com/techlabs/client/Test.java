package com.techlabs.client;

import java.util.Scanner;

import com.techlabs.model.Board;
import com.techlabs.model.Game;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyser;

public class Test {

	public static void main(String[] args) {
		Board board = new Board();
		Scanner scan = new Scanner(System.in);
		Player[] players = new Player[2];
		System.out.println("ENTER PLAYER 1 NAME :");
		players[0] = new Player(scan.nextLine(), Mark.X);
		System.out.println("ENTER PLAYER 2 NAME :");
		players[1] = new Player(scan.nextLine(), Mark.O);
		ResultAnalyser analyseResult = new ResultAnalyser(board);
		Game game = Game.getInstance(players, board, analyseResult);
		do {
			System.out.println(game.getCurrentPlayer().getPlayerName() + " enter position : ");
			int pos = scan.nextInt();
			game.play(pos);
		} while (game.getStatus().equalsIgnoreCase("In Progress"));
		System.out.println(game.getNextPlayer().getPlayerName() + " won the match");
		scan.close();
	}
}
