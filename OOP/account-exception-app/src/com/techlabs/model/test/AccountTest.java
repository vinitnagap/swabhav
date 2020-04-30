package com.techlabs.model.test;

import com.techlabs.model.*;

public class AccountTest {

	public static void main(String args[]) {

		Account.setMinimumBalance(1000);
		Account a1 = new Account(101, "abc", 1000);
		try {
			a1.withdraw(600);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("End of main");

		System.out.println("Balance of A1= " + a1.getBalance());

	}
}
