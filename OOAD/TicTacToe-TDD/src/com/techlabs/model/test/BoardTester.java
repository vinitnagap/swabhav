package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Mark;

public class BoardTester {

	Board board = new Board();

	@Test
	public void test_markCell4WithO() {
		board.setMark(4, Mark.O);
		assertEquals(Mark.O, board.getCell(4).getMark());
	}

	@Test
	public void test_markSameCell() {
		try {
			board.setMark(1, Mark.X);
			assertEquals(Mark.X, board.getCell(1).getMark());
			board.setMark(1, Mark.X);
		} catch (RuntimeException e) {
			assertEquals("Position already taken", e.getMessage());
		}

	}

	@Test
	public void test_sizeOfBoardIs9() {
		assertEquals(9, board.getCells().length);
	}
}
