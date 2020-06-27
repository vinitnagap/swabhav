package com.techlabs.frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private JButton b1, b2;

	public MainFrame() {
		super();
		this.setVisible(true);
		this.setSize(500, 500);
		JPanel p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JButton("Red");
		b2 = new JButton("Green");
		p.add(b1);
		p.add(b2);
		this.add(p);
		b1.addActionListener(CommonListener.getInstance());
		p.setBackground(Color.RED);
		b2.addActionListener(CommonListener.getInstance());

	}
}
