package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Game;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyser;

public class GameTester {

	Player[] players = new Player[2];
	Board board = new Board();
	ResultAnalyser resultAnalyser = new ResultAnalyser(board);

	@Test
	public void test_checkGameInProgress() {
		players[0] = new Player("Ram", Mark.X);
		players[1] = new Player("Gopal", Mark.O);
		Game game = new Game(players, board, resultAnalyser);
		assertEquals("In Progress", game.play(5));

	}

	@Test
	public void test_checkCurrentPlayerSwitchOrNot() {
		players[0] = new Player("Ram", Mark.X);
		players[1] = new Player("Gopal", Mark.O);
		Game game = new Game(players, board, resultAnalyser);
		assertEquals(players[0], game.getCurrentPlayer());
		game.play(5);
		assertEquals(players[1], game.getCurrentPlayer());

	}

	@Test
	public void test_checkNextPlayerSwitchOrNot() {
		players[0] = new Player("Ram", Mark.X);
		players[1] = new Player("Gopal", Mark.O);
		Game game = new Game(players, board, resultAnalyser);
		assertEquals(players[1], game.getNextPlayer());
		game.play(5);
		assertEquals(players[0], game.getNextPlayer());

	}

}
