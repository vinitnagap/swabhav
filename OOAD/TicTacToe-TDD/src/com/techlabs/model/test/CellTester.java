package com.techlabs.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.model.Cell;
import com.techlabs.model.Mark;

public class CellTester {

	Cell cell = new Cell();

	@Test
	public void test_initialMark() {
		assertEquals(Mark.EMPTY, cell.getMark());
	}

	@Test
	public void test_markAfterSettingO() {
		cell.setMark(Mark.O);
		assertEquals(Mark.O, cell.getMark());
	}

	@Test
	public void test_markAfterSettingX() {
		cell.setMark(Mark.X);
		assertEquals(Mark.X, cell.getMark());
	}

	@Test
	public void test_markSameCell() {
		try {
			cell.setMark(Mark.X);
			cell.setMark(Mark.O);
		} catch (RuntimeException e) {
			assertEquals("Position already taken", e.getMessage());
		}
	}
}
