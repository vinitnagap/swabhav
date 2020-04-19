package com.techlabs.model.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import com.techlabs.model.Account;
import com.techlabs.model.SavingAccount;

public class SATester4 {

	@Test
	public void test_accountTypeTester() throws ParseException {
		Account account = new SavingAccount(10, "abc", 15000, "01/23/2019",
				"01/01/1976");
		assertEquals("Saving Account", account.getAccountType());
	}

}
