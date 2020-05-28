package com.techlabs.model;

public class Singleton {

	public static Singleton object;

	private Singleton() {
		System.out.println("Instance Created");
	}

	public static Singleton getInstance() {
		if (object == null) {
			synchronized (Singleton.class) {
				if (object == null) {
					object = new Singleton();

				}
			}
		}
		return object;
	}
}
