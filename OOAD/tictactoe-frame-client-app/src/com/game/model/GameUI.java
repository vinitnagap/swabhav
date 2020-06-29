package com.game.model;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.techlabs.model.Board;
import com.techlabs.model.Game;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyser;

public class GameUI implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel(new GridLayout(4, 3));
	private JLabel status = new JLabel("Status:");
	private JLabel CurrentPlayer = new JLabel("CurrentPlayer:");
	private JLabel winner = new JLabel();
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private String player;
	private MainPage mainFrame;
	private Board board;
	private Game game;
	private Player[] players = new Player[2];

	public GameUI(MainPage mainframe) {
		this.mainFrame = mainframe;
		panel.add(status);
		panel.add(CurrentPlayer);
		panel.add(winner);
		panel.setLocation(0, 200);
		for (int i = 0; i < 9; i++) {
			buttons.add(new JButton(i + ""));
			panel.add(buttons.get(i));
			buttons.get(i).addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Next") {
			board = new Board();
			players[0] = new Player(mainFrame.getplayer1(), Mark.X);
			players[1] = new Player(mainFrame.getplayer2(), Mark.O);
			game = Game.getInstance(players, board, new ResultAnalyser(board));
			setStatus();
			setCurrentPlayer();
			player = game.getCurrentPlayer().getPlayerName();
			frame.add(panel);
			frame.setVisible(true);
			frame.setSize(500, 500);
			return;
		}
		int location = Integer.parseInt(e.getActionCommand());
		game.play(location);
		buttons.get(location).addActionListener(null);
		setStatus();
		setCurrentPlayer();
		setWinner();
		buttons.get(location).setText(game.getCurrentPlayer().getPlayerMark().toString());
	}

	private void setWinner() {
		if (game.getStatus() == "Win") {
			winner.setText("Winner: " + game.getNextPlayer().getPlayerName());
		}
	}

	private void setCurrentPlayer() {
		CurrentPlayer.setText("Current Player: " + game.getCurrentPlayer().getPlayerName());
	}

	private void setStatus() {
		String text = "Status: ";
		switch (game.getStatus()) {
		case "In Progress":
			status.setText(text + "In Progress");
			break;
		case "Win":
			status.setText(text + "Win");
			break;
		case "Draw":
			status.setText(text + "Draw");
			break;
		default:
			break;
		}

	}

}
