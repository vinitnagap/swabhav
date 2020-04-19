package com.techlabs.model.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;
import com.techlabs.model.*;

public class SATester1 {

	@SuppressWarnings("deprecation")
	@Test
	public void test_accountBalanceTester() throws ParseException {

		Account account = new SavingAccount(10, "abc", 15000, "01/23/2019",
				"01/01/1976");
		account.withdraw(5000);
		assertEquals(10000, account.getBalance(), 0);
	}
}
