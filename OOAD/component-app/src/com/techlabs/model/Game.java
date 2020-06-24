package com.techlabs.model;


public class Game {

	private static Game instance;
	private Board board;
	private ResultAnalyser resultAnalyser;
	private Player currentPlayer, nextPlayer;

	private Game(Player[] players, Board board, ResultAnalyser resultAnalyser) {
		this.board = board;
		this.resultAnalyser = resultAnalyser;
		this.currentPlayer = players[0];
		this.nextPlayer = players[1];
	}

	public static Game getInstance(Player[] players, Board board, ResultAnalyser resultAnalyser) {
		if (instance == null) {
			instance = new Game(players, board, resultAnalyser);
			return instance;
		}
		return instance;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;

	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void play(int pos) {
		Player player = getCurrentPlayer();
		board.getCell(pos).setMark(player.getPlayerMark());
		Player tempPlayer = currentPlayer;
		currentPlayer = nextPlayer;
		nextPlayer = tempPlayer;
	}

	public Board getBoard() {
		return board;
	}

	public String getStatus() {
		return resultAnalyser.analyseResult();
	}
}
