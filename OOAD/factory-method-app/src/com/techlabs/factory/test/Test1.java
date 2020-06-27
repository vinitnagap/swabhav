package com.techlabs.factory.test;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.TeslaFactory;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAutoFactory factory = TeslaFactory.getInstance();
		System.out.println(factory.getClass());

		IAuto auto = factory.make();
		auto.start();
		auto.stop();

	}

}
