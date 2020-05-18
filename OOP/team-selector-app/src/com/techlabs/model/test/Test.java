package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.TeamBuilder;

public class Test {

	public static void main(String args[]) {
		List<String> members = new ArrayList<String>();
		System.out.println("Enter no. of members:");
		Scanner sc = new Scanner(System.in);
		int totalMember = sc.nextInt();
		for (int i = 1; i <= totalMember; i++) {
			System.out.println("Enter member " + i);
			String member = sc.next();
			members.add(member);
		}
		sc.close();
		TeamBuilder teams = new TeamBuilder();
		teams.getTeams(members, totalMember);
	}

}
