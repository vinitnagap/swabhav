package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.techlabs.model.Account;

public class AccountTester {

	Account a1 = new Account(101, "abc", 1000);

	@Before
	public void setup() {
		Account.setMinimumBalance(1000);
	}

	@Test
	public void test() {
		try {
			a1.withdraw(600);
		} catch (Exception ex) {
			System.out.println("Transaction failed!!!");
		}
		a1.getBalance();
		assertEquals(1000.0, a1.getBalance(), .0);
	}
}
