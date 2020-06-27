package com.techlabs.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame() {
		super();
		this.setVisible(true);
		this.setSize(500, 500);
		JPanel p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b = new JButton("Place Order");
		p.add(b);
		this.add(p);
		b.addActionListener(new EmailLisener());
		b.addActionListener(new SmsLisener());
	}
}
