package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListener implements ActionListener {

	public static CommonListener instance;

	private CommonListener() {
		// TODO Auto-generated constructor stub
		System.out.println("Object Created");
	}

	public static CommonListener getInstance() {
		if (instance == null) {
			instance = new CommonListener();
			return instance;
		}
		return instance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Color Changed");
		if (e.getSource() == b1) {

		}

	}

}
