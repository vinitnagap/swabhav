package com.techlabs.model;

public class InsufficientFundsException extends RuntimeException {

	public InsufficientFundsException(Account acc) {
		super(
				"!!!Transaction Failed!!!\nCannot withdraw due to low balance i.e. "
						+ acc.getBalance());
	}

}
