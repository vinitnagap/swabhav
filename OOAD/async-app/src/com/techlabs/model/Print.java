package com.techlabs.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Print extends Thread {
	@Override
	public void run() {
		while (true) {
			Calendar calender = new GregorianCalendar();
			int hour = calender.get(Calendar.HOUR);
			int min = calender.get(Calendar.MINUTE);
			int sec = calender.get(Calendar.SECOND);
			System.out.println(hour + " : " + min + " : " + sec);
		}
	}

}
