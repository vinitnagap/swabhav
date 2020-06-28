package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListener implements ActionListener {

	public static CommonListener instance;

	private MainFrame frame;

	private CommonListener(MainFrame frame) {
		// TODO Auto-generated constructor stub
		System.out.println("Object Created");
		this.frame = frame;
	}

	public static CommonListener getInstance(MainFrame frame) {
		if (instance == null) {
			instance = new CommonListener(frame);
			return instance;
		}
		return instance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == frame.getButtonB1()) {
			frame.getPanel().setBackground(Color.RED);
		}
		if (e.getSource() == frame.getButtonB2()) {
			frame.getPanel().setBackground(Color.GREEN);
		}

	}

}
