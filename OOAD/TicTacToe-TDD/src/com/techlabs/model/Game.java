package com.techlabs.model;

public class Game {

	private Board board;
	private ResultAnalyser resultAnalyser;
	private Player currentPlayer, nextPlayer;

	public Game(Player[] players, Board board, ResultAnalyser resultAnalyser) {
		this.board = board;
		this.resultAnalyser = resultAnalyser;
		this.currentPlayer = players[0];
		this.nextPlayer = players[1];
	}

	public Player getCurrentPlayer() {
		return currentPlayer;

	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public String play(int pos) {
		String status;
		Player player = getCurrentPlayer();
		board.getCell(pos).setMark(player.getPlayerMark());
		Player tempPlayer = currentPlayer;
		currentPlayer = nextPlayer;
		nextPlayer = tempPlayer;
		status = resultAnalyser.analyseResult();
		return status;
	}

	public Board getBoard() {
		return board;
	}
}
