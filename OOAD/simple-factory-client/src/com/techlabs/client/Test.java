package com.techlabs.client;

import com.techlabs.product.AutoType;
import com.techlabs.product.AutomobileFactory;
import com.techlabs.product.IAuto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomobileFactory automobile = AutomobileFactory.getInstance();
		IAuto auto = automobile.make(AutoType.BMW);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();
	}

}
