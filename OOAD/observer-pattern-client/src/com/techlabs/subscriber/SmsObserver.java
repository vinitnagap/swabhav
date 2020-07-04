package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceObserver;

public class SmsObserver implements IBalanceObserver {

	public SmsObserver() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Sms Observer");
	}

	@Override
	public void update(Account acc) {
		// TODO Auto-generated method stub
		System.out.println("Balance changed to " + acc.getBalance() + " for " + acc.getName());
		System.out.println("Sms is being send");

	}

}
