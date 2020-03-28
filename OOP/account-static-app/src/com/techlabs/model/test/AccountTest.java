package com.techlabs.model.test;

import com.techlabs.model.*;

public class AccountTest {

	public static void main(String args[]) {

		Account.setMinimumBalance(100);
		Account a1 = new Account();
		a1.setBalance(10000);
		a1.deposit(100);
		a1.withdraw(10);
		System.out.println("Balance of A1= " + a1.getBalance());

		Account a2 = new Account();
		a2.setBalance(20000);
		a2.deposit(1000);
		a2.withdraw(200);
		System.out.println("Balance of A2 = " + a2.getBalance());

		System.out.println(" Total no. of Transactions = "
				+ Account.getTotalTransations());
	}
}
