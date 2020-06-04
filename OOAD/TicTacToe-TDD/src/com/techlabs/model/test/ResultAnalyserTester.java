package com.techlabs.model.test;

import org.junit.Test;
import static org.junit.Assert.*;
import com.techlabs.model.Board;
import com.techlabs.model.Mark;
import com.techlabs.model.ResultAnalyser;

public class ResultAnalyserTester {

	Board board = new Board();
	ResultAnalyser result = new ResultAnalyser(board);

	@Test
	public void test_checkGameInProgress() {
		board.setMark(0, Mark.X);
		String checkResult = result.analyseResult();
		assertEquals("In Progress", checkResult);
	}

	@Test
	public void test_checkWinnerX_ForRow1() {
		board.setMark(0, Mark.X);
		board.setMark(2, Mark.X);
		board.setMark(1, Mark.X);
		String checkResult = result.analyseResult();
		assertEquals("Win", checkResult);
	}

	@Test
	public void test_checkDraw() {
		board.setMark(0, Mark.X);
		board.setMark(1, Mark.X);
		board.setMark(2, Mark.O);
		board.setMark(3, Mark.O);
		board.setMark(4, Mark.X);
		board.setMark(5, Mark.X);
		board.setMark(6, Mark.X);
		board.setMark(7, Mark.O);
		board.setMark(8, Mark.O);
		String checkResult = result.analyseResult();
		assertEquals("Draw", checkResult);
	}

}
