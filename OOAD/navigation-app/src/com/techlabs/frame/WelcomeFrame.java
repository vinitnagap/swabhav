package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame implements ActionListener {

	private NameFrame frame;

	public WelcomeFrame(NameFrame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// JLabel label = new JLabel();

		JFrame frame2 = new JFrame("Clicked");
		frame2.setVisible(true);
		frame2.setSize(200, 200);
		JLabel label = new JLabel();
		label.setText("Welcome " + frame.getTextName());
		JPanel panel = new JPanel();
		frame2.add(panel);
		panel.add(label);

	}

}
