package com.techlabs.model;

public class Account {

	private int accno;
	private String name;
	private double balance;
	private static int MINIMUM_BALANCE;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		if (balance - amt > MINIMUM_BALANCE) {
			balance = balance - amt;
		}
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setMinimumBalance(int mimBalance) {
		MINIMUM_BALANCE = mimBalance;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public int getAccNo() {
		return accno;
	}

	@Override
	public String toString() {
		String str = super.toString() + "\naccno: " + accno + "\nname: " + name
				+ "\nbalance: " + balance;

		return str;
	}

	@Override
	public boolean equals(Object a) {
		Account account = (Account) a;
		if (this.name == account.name && this.accno == account.accno
				&& this.balance == account.balance)
			return true;
		return false;
	}

}
