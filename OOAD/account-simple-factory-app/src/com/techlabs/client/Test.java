package com.techlabs.client;

import com.techlabs.component.Account;
import com.techlabs.component.AccountFactory;
import com.techlabs.component.AccountType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountFactory factory = AccountFactory.getInstance();

		Account acc = factory.make(AccountType.SA);
		acc.setAccNo(101);
		acc.setName("abc");
		acc.deposit(10000);
		//acc.withdraw(10000);

		acc.withdraw(8000);
		printInfo(acc);

		Account acc2 = factory.make(AccountType.CA);
		acc2.setAccNo(101);
		acc2.setName("abc");
		acc2.deposit(10000);
		acc2.withdraw(10000);
		printInfo(acc2);
	}

	private static void printInfo(Account acc) {
		System.out
				.println("Acc No. : " + acc.getAccNo() + " Name : " + acc.getName() + " Balance : " + acc.getBalance());
	}

}
