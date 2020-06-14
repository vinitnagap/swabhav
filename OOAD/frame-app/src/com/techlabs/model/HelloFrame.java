package com.techlabs.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFrame extends JFrame {

	public HelloFrame(String value) {
		super(value);
		this.setVisible(true);
		this.setSize(500, 500);
		JPanel p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		p.add(b1);
		p.add(b2);
		//p.setAlignmentX(Component.CENTER_ALIGNMENT);
		//p.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		p.setBackground(Color.CYAN);
		this.add(p);

	}

}
