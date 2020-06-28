package com.game.model;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.techlabs.model.Mark;
import com.techlabs.model.Player;

public class StartGame extends JFrame {
	private JTextField textfield1, textfield2;
	private Player[] players = new Player[2];

	public StartGame() {
		JButton b = new JButton("Next");
		b.setBounds(100, 150, 140, 40);
		JLabel label = new JLabel();
		label.setText("Player 'X' :");
		label.setBounds(10, 10, 100, 100);

		JLabel label1 = new JLabel();
		label1.setBounds(50, 110, 200, 100);
		textfield1 = new JTextField();
		textfield1.setBounds(110, 50, 130, 30);
		this.add(label1);
		this.add(textfield1);
		this.add(label);
		this.add(b);
		this.setSize(300, 300);

		JLabel label2 = new JLabel();
		label2.setText("Player 'O' :");
		label2.setBounds(10, 50, 100, 100);

		JLabel label3 = new JLabel();
		label3.setBounds(10, 170, 200, 100);
		textfield2 = new JTextField();
		textfield2.setBounds(110, 100, 130, 30);
		this.add(label3);
		this.add(textfield2);
		this.add(label2);
		this.add(b);
		this.setSize(300, 300);

		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new GameUI());
		players[0] = new Player(textfield1.getText(), Mark.X);
		players[1] = new Player(textfield2.getText(), Mark.O);
	}

	public Player[] getPlayer() {
		return players;
	}
}
