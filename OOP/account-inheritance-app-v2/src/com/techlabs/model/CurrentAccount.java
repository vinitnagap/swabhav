package com.techlabs.model;

import java.text.ParseException;

public class CurrentAccount extends Account {

	final int MINIMUM_BALANCE = -5000;

	public CurrentAccount(int accno, String name, double balance,
			String recordDate, String birthDate) throws ParseException {
		super(accno, name, balance, recordDate, birthDate);
		accountType = "Current Account";

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
