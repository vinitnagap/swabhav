package com.techlabs.model.test;

import com.techlabs.model.*;

public class PlayerTest {
	public static void main(String[] args) {
		Player sachin = new Player(101, "sachin", 10);
		Player virat = new Player(102, "virat");
		printInfo(sachin);
		printInfo(virat);
		Player temp = sachin.whoIsElder(virat);
		System.out.println("Elder is " + temp.getName());
		System.out.println("Displaying temp hash code " + temp.hashCode());
		System.out.println("Displaying sachin hash code " + sachin.hashCode());
		System.out.println("Displaying virat hash code " + virat.hashCode());
	}

	public static void printInfo(Player p) {
		System.out.println("ID = " + p.getId());
		System.out.println("NAME = " + p.getName());
		System.out.println("AGE = " + p.getAge());
	}
}
