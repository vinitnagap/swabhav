package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeamBuilder {
	public void getTeams(List<String> list, int totalItems) {
		int start = 0, end = 1;
		Random rand = new Random();
		List<String> newList = new ArrayList<>();
		for (int i = 1; i <= totalItems; i++) {

			int randomIndex = rand.nextInt(list.size());
			newList.add(list.get(randomIndex));
			list.remove(randomIndex);
		}
		int index = 1;
		while (end < totalItems) {
			System.out.println("Team " + index + ":");
			String firstMember = newList.get(start);
			String secondMemeber = newList.get(end);
			System.out.println("Player 1 :" + firstMember);
			System.out.println("Player 2 :" + secondMemeber);
			start = start + 2;
			end = end + 2;
			index++;
		}
	}
}
