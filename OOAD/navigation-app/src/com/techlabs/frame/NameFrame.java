package com.techlabs.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NameFrame extends JFrame {

	private JTextField textfield;

	public NameFrame() {
		JButton b = new JButton("Next");
		b.setBounds(100, 100, 140, 40);
		JLabel label = new JLabel();
		label.setText("Enter Name :");
		label.setBounds(10, 10, 100, 100);
		JLabel label1 = new JLabel();
		label1.setBounds(10, 110, 200, 100);
		textfield = new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		this.add(label1);
		this.add(textfield);
		this.add(label);
		this.add(b);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new WelcomeFrame(this));

	}

	public String getTextName() {
		return textfield.getText();
	}
}
