package com.game.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

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
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame2 = new JFrame("Tic-Tac-Toe");
		// frame2.setVisible(true);
		frame2.setSize(500, 500);
		JLabel label = new JLabel();
		JPanel panel = new JPanel();

		b1 = new JButton("");
		b1.setBounds(13, 13, 90, 90);
		b2 = new JButton("");
		b2.setBounds(110, 13, 90, 90);
		b3 = new JButton("");
		b3.setBounds(207, 13, 90, 90);
		b4 = new JButton("");
		b4.setBounds(13, 110, 90, 90);
		b5 = new JButton("");
		b5.setBounds(110, 110, 90, 90);
		b6 = new JButton("");
		b6.setBounds(207, 110, 90, 90);
		b7 = new JButton("");
		b7.setBounds(13, 207, 90, 90);
		b8 = new JButton("");
		b8.setBounds(110, 207, 90, 90);
		b9 = new JButton("");
		b9.setBounds(207, 207, 90, 90);
		frame2.add(b1);
		frame2.add(b2);
		frame2.add(b3);
		frame2.add(b4);
		frame2.add(b5);
		frame2.add(b6);
		frame2.add(b7);
		frame2.add(b8);
		frame2.add(b9);

		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);

		StartGame obj = new StartGame();
		Board board = new Board();
		ResultAnalyser analyseResult = new ResultAnalyser(board);
		Game game = Game.getInstance(obj.getPlayer(), board, analyseResult);

		frame2.setLayout(null);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.add(panel);
		panel.add(label);
	}

	public void setEnable() {
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}

	class A1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class A2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class A3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class A4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class A5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class A6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
