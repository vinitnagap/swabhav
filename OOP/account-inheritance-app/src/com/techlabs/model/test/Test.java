package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(101, "abc", 10000);
		CurrentAccount ca = new CurrentAccount(102, "xyz", 30000);
		sa.deposit(100);
		ca.deposit(200);
		sa.withdraw(1000);
		ca.withdraw(20000);
		printInfo(sa);
		printInfo(ca);

	}

	public static void printInfo(Account acc) {
		System.out.println("Account No. = " + acc.getAccNo());
		System.out.println("Name = " + acc.getName());
		System.out.println("Balance = " + acc.getBalance());
	}
}
