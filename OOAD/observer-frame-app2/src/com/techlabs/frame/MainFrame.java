package com.techlabs.frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private JButton b1, b2;
	private JPanel p;

	public MainFrame() {
		super();
		this.setVisible(true);
		this.setSize(500, 500);
		p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JButton("red");
		b2 = new JButton("green");
		p.add(b1);
		p.add(b2);
		p.setBackground(Color.BLACK);
		this.add(p);
		b1.addActionListener(CommonListener.getInstance(this));
		b2.addActionListener(CommonListener.getInstance(this));

	}

	public JButton getButtonB1() {
		return b1;
	}

	public JButton getButtonB2() {
		return b2;
	}

	public JPanel getPanel() {
		return p;
	}

}
