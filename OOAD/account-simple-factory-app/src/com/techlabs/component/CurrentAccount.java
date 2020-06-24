package com.techlabs.component;

public class CurrentAccount extends Account {

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		super.setBalance(super.getBalance() - amt);

	}

}
