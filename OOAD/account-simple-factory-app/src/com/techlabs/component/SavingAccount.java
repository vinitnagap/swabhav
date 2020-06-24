package com.techlabs.component;

public class SavingAccount extends Account {

	private double MINIMUM_BALANCE = 1000;

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		if (super.getBalance() - amt <= MINIMUM_BALANCE) {
			throw new RuntimeException("Less balance");
		} else {
			super.setBalance(super.getBalance() - amt);
		}
	}

}
