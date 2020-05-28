package com.techlabs.model.test;

import com.techlabs.model.Singleton;

public class Test {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton obj = Singleton.getInstance();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton obj = Singleton.getInstance();

			}
		});
		t1.start();
		t2.start();

	}
}
