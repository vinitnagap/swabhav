package com.techlabs.component;

public abstract class Account {
	private int accNo;
	private String name;
	private double balance;

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public abstract void withdraw(double amt);

	public double getBalance() {
		return balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
