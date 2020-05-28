package com.techlabs.model;

public class SecurityPinChecker {

	private int pin = 1521;

	public int getSecurityCode() {
		return pin;
	}

	public boolean isCodeCorrect(int pin) {

		if (pin == getSecurityCode()) {

			return true;

		} else {

			return false;

		}

	}

}
