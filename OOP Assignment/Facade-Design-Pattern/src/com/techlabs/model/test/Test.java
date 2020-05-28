package com.techlabs.model.test;

import com.techlabs.model.BankAccountManager;

public class Test {
	public static void main(String[] args) {

		BankAccountManager manageAccount = new BankAccountManager(1456823, 1521);

		manageAccount.depositCash(100);

		manageAccount.withdrawCash(1000);

		manageAccount.withdrawCash(20000);

	}
}
