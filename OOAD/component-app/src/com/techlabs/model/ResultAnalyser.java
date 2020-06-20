package com.techlabs.model;

public class ResultAnalyser {

	private Board board;

	public ResultAnalyser(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public String analyseResult() {
		if (checkRow() == true || checkColumn() == true
				|| checkDiagonal() == true) {
			return "Win";
		} else if (board.isBoardFull()) {
			return "Draw";
		} else {
			return "In Progress";
		}
	}

	private boolean checkRow() {
		if (checkCell(0, 1, 2) == true) {
			return true;
		} else if (checkCell(3, 4, 5) == true) {
			return true;
		} else if (checkCell(6, 7, 8) == true) {
			return true;
		}
		return false;
	}

	private boolean checkDiagonal() {
		if (checkCell(0, 4, 8) == true) {
			return true;
		} else if (checkCell(2, 4, 6) == true) {
			return true;
		}
		return false;
	}

	private boolean checkColumn() {
		if (checkCell(0, 3, 6) == true) {
			return true;
		} else if (checkCell(1, 4, 7) == true) {
			return true;
		} else if (checkCell(2, 5, 8) == true) {
			return true;
		}
		return false;
	}

	private boolean checkCell(int pos1, int pos2, int pos3) {
		if (this.board.getCell(pos1).getMark() == this.board.getCell(pos2)
				.getMark()
				&& this.board.getCell(pos2).getMark() == this.board.getCell(
						pos3).getMark()) {
			if (this.board.getCell(pos1).getMark().equals(Mark.EMPTY)) {
				return false;
			}
			return true;
		}
		return false;
	}
}