package com.techlabs.component;

public class AccountFactory {
	public static AccountFactory instance;

	private AccountFactory() {

	}

	public static AccountFactory getInstance() {
		if (instance == null) {
			instance = new AccountFactory();
			return instance;
		}
		return instance;
	}

	public Account make(AccountType type) {
		if (type == AccountType.CA) {
			return new CurrentAccount();
		} else if (type == AccountType.SA) {
			return new SavingAccount();
		} else
			return null;
	}
}
