package com.techlabs.model.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import com.techlabs.model.Account;
import com.techlabs.model.SavingAccount;

public class SATester5 {

	@Test
	public void test_accountNameTester() throws ParseException{
		Account account = new SavingAccount(10, "abc", 15000, "01/23/2019",
				"10/01/1998");
		assertEquals(22, account.getAge());
	}

}
