package com.techlabs.model;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sync extends JFrame {

	public Sync() {
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
				while (true) {
					Calendar calender = new GregorianCalendar();
					int hour = calender.get(Calendar.HOUR);
					int min = calender.get(Calendar.MINUTE);
					int sec = calender.get(Calendar.SECOND);
					System.out.println(hour + " : " + min + " : " + sec);
				}
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
