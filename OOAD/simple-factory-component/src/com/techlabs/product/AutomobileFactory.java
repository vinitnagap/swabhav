package com.techlabs.product;

public class AutomobileFactory {

	private static AutomobileFactory instance;

	private AutomobileFactory() {

	}

	public static AutomobileFactory getInstance() {
		if (instance == null) {
			instance = new AutomobileFactory();
			return instance;
		}
		return instance;
	}

	public IAuto make(AutoType type) {
		if (type == AutoType.BMW) {
			return new Bmw();
		}
		if (type == AutoType.AUDI) {
			return new Audi();
		}
		if (type == AutoType.TESLA) {
			return new Tesla();
		} else {
			return null;
		}

	}
}
