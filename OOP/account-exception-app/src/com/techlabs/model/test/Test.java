package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(101, "abc", 1000);
		try {
			sa.withdraw(600);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		printInfo(sa);
		System.out.println("End of main");

	}

	public static void printInfo(Account acc) {
		System.out.println("Account No. = " + acc.getAccNo());
		System.out.println("Name = " + acc.getName());
		System.out.println("Balance = " + acc.getBalance());
	}
}
