package com.techlabs.model;

import java.text.ParseException;

public class SavingAccount extends Account {

	final int MINIMUM_BALANCE = 1000;

	public SavingAccount(int accno, String name, double balance,
			String recordDate, String birthDate) throws ParseException {
		super(accno, name, balance, recordDate, birthDate);
		accountType = "Saving Account";
	}

	@Override
	public void withdraw(double amt) {
		if (balance - amt > MINIMUM_BALANCE) {
			balance = balance - amt;
		} else if (balance == 0) {
			System.out.println("Cannot Withdraw");
		}
		return;
	}
}
