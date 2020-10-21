package com.techlabs.model;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Async extends JFrame {

	public Async() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		JButton helloBtn = new JButton("Hello");
		JButton printBtn = new JButton("Print");
		this.add(helloBtn);
		this.add(printBtn);
		helloBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(), "Hello");

			}
		});
		printBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Print printThread = new Print();
				printThread.start();
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
