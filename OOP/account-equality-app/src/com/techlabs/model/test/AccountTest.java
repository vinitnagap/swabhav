package com.techlabs.model.test;

import com.techlabs.model.*;

public class AccountTest {

	public static void main(String args[]) {

		Account.setMinimumBalance(100);
		Account a1 = new Account(101, "abc", 5000);
		a1.setBalance(10000);
		a1.deposit(100);
		a1.deposit(5000);
		a1.withdraw(10);
		System.out.println("Balance of A1= " + a1.getBalance());

	}
}
