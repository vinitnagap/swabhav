package com.techlabs.model;

public class BankAccountManager {
	private int accountNumber;
	private int pin;

	AccountNumberChecker accNoChecker;
	SecurityPinChecker pinChecker;
	TransactionManager transactionChecker;

	public BankAccountManager(int newAccNo, int newPinCode) {

		accountNumber = newAccNo;
		pin = newPinCode;

		accNoChecker = new AccountNumberChecker();
		pinChecker = new SecurityPinChecker();
		transactionChecker = new TransactionManager();

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return pin;
	}

	public void withdrawCash(double cashToGet) {

		if (accNoChecker.accountActive(getAccountNumber())
				&& pinChecker.isCodeCorrect(getSecurityCode())
				&& transactionChecker.haveEnoughMoney(cashToGet)) {

			System.out.println("Transaction Complete\n");

		} else {

			System.out.println("Transaction Failed\n");

		}

	}

	public void depositCash(double cashToDeposit) {

		if (accNoChecker.accountActive(getAccountNumber())
				&& pinChecker.isCodeCorrect(getSecurityCode())) {

			transactionChecker.makeDeposit(cashToDeposit);

			System.out.println("Transaction Complete\n");

		} else {

			System.out.println("Transaction Failed\n");

		}

	}
}
