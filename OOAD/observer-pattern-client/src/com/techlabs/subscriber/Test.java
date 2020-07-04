package com.techlabs.subscriber;

import com.techlabs.publisher.Account;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(101, "abc", 5000);
		Account acc2 = new Account(102, "xyz", 10000);
		acc1.addBalanceObserver(new SmsObserver());
		acc1.addBalanceObserver(new EmailObserver());
		acc2.addBalanceObserver(new SmsObserver());
		acc2.addBalanceObserver(new EmailObserver());
		acc1.deposit(1000);
		acc1.withdraw(500);
		acc2.withdraw(1000);

	}

}
