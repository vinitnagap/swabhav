package com.techlabs.model.test;

import com.techlabs.model.Singleton;

public class Test {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.INSTANCE;
		obj1.value = 5;
		obj1.show();

		Singleton obj2 = Singleton.INSTANCE;
		obj2.value = 10;
		obj1.show();
	}
}
