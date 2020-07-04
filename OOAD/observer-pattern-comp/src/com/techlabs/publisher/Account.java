package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accno;
	private String name;
	private double balance;
	private List<IBalanceObserver> observers = new ArrayList<>();

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance += amt;
		notifyAll(this);

	}

	public void withdraw(double amt) {
		this.balance -= amt;
		notifyAll(this);
	}

	private void notifyAll(Account acc) {
		for (IBalanceObserver observer : observers) {
			observer.update(this);
		}
	}

	public void addBalanceObserver(IBalanceObserver observer) {
		observers.add(observer);
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
