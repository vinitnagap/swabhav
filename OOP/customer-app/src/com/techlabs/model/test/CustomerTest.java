package com.techlabs.model.test;

import com.techlabs.model.*;

public class CustomerTest {

	public static void main(String args[]) {
		Customer c1 = new Customer("abc", 10);
		Customer c2 = new Customer("pqr", 20);
		Customer c3 = new Customer("lmnor", 30);

		System.out.println(c1.getId());
		System.out.println(c2.getId());
		System.out.println(c3.getId());
		System.out.println(c3.getId());
	}

}
