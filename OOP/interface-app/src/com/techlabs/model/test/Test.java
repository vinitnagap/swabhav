package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.IEmotionable;
import com.techlabs.model.IMannerable;
import com.techlabs.model.Man;

public class Test {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atPartyHall(man);
		atPartyHall(boy);
		// atCinemaHall(man); Man Doesn't implements IMannerable interface
		atCinemaHall(boy);
	}

	private static void atCinemaHall(IEmotionable obj) {
		System.out.println("At Cinema Hall");
		obj.cry();
		obj.laugh();
	}

	private static void atPartyHall(IMannerable obj) {
		System.out.println("At Party Hall");
		obj.depart();
		obj.wish();
	}
}
