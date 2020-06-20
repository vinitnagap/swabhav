package com.techlabs.model;

public class Board {
	private Cell[] cells;

	public Board() {
		cells = new Cell[9];
		for (int i = 0; i < 9; i++)
			cells[i] = new Cell();
	}

	public void setMark(int position, Mark mark) {
		cells[position].setMark(mark);
		return;
	}

	public boolean isBoardFull() {
		for (Cell cell : cells) {
			if (cell.getMark() == Mark.EMPTY)
				return false;
		}
		return true;
	}

	public Cell[] getCells() {
		return cells;
	}

	public Cell getCell(int position) {
		return cells[position];
	}
}
