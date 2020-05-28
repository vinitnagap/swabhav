package com.techlabs.model;

public class AccountNumberChecker {

	private int accountNumber = 1456823;

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean accountActive(int acctNumToCheck) {

		if (acctNumToCheck == getAccountNumber()) {

			return true;

		} else {

			return false;

		}

	}
}
