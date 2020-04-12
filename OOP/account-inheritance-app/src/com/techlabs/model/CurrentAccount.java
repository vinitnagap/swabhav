package com.techlabs.model;

public class CurrentAccount extends Account {

	final int MINIMUM_BALANCE = -5000;

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(int amt) {
		if (balance - amt > MINIMUM_BALANCE) {
			balance = balance - amt;
		} else if (balance == 0) {
			System.out.println("Cannot Withdraw");
		}
		return;
	}
}
