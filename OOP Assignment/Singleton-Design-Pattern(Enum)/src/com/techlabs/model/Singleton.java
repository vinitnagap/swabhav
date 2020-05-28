package com.techlabs.model;

public enum Singleton {

	INSTANCE;
	public int value;

	public void show() {
		System.out.println(value);
	}
}
