package com.techlabs.model;

public abstract class Account {

	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int amt) {
		balance = balance + amt;
	}

	public abstract void withdraw(int amt);

	public int getAccNo() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
