package com.techlabs.model;

public class Cell {
	private Mark mark = Mark.EMPTY;

	public void setMark(Mark mark) {
		if (this.mark == Mark.O || this.mark == Mark.X) {
			throw new RuntimeException("Position already taken");
		}
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}
}
