package com.techlabs.model.test;

import java.text.ParseException;
import com.techlabs.model.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.model.Account;

public class CATester2 {

	@Test
	public void test_accountNoTester() throws ParseException {
		Account account = new CurrentAccount(10, "abc", 15000, "01/23/2019",
				"01/01/1976");
		assertEquals(10, account.getAccno());
	}

}
