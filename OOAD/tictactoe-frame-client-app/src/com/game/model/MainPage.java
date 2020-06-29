package com.game.model;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.techlabs.model.Mark;
import com.techlabs.model.Player;

public class MainPage extends JFrame {

	private JPanel panel = new JPanel();
	private JLabel label1 = new JLabel("Player O:");
	private JTextArea player1 = new JTextArea("\t");
	private JLabel label2 = new JLabel("Player X:");
	private JTextArea player2 = new JTextArea("\t");
	private JButton button = new JButton("Next");

	public MainPage() {
		label1.setBounds(100, 30, 400, 30);
		button.addActionListener(new GameUI(this));
		this.add(panel);
		panel.add(label1);
		panel.add(player1);

		panel.add(label2);
		panel.add(player2);

		this.add(button);
		this.setLayout(new FlowLayout());
		this.setSize(350, 150);
		this.setVisible(true);

	}

	public String getplayer1() {
		return player1.getText();
	}

	public String getplayer2() {
		return player2.getText();
	}

}
