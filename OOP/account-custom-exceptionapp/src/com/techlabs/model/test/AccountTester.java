package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.model.Account;

public class AccountTester {

	Account acc = new Account(12, "vinit", 1000);

	public void setup() {
		Account.setMinimumBalance(1000);
	}

	@Test
	public void test_checkAccountBalancIs1200_forBalance1000_amountDeposited200() {
		acc.deposit(200);
		assertEquals(1200.0, acc.getBalance(), .0);
	}

	@Test
	public void test_checkTransactionFailed_forBalance1000_amoutWithdrawn200() {
		try {
			acc.withdraw(200);
			assertEquals(800.0, acc.getBalance(), .0);

		} catch (Exception e) {
			assertEquals(e.getMessage(),
					"!!!Transaction Failed!!!\nCannot withdraw due to low balance i.e. "
							+ acc.getBalance());
		}

	}

	@Test
	public void test_getAccno() {
		assertEquals(12, acc.getAccNo());
	}

	@Test
	public void test_getName() {
		assertEquals("vinit", acc.getName());
	}

}
