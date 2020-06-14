package com.techlabs.service;

public enum DataService {

	INSTANCE;

	public void doSomething() {
		System.out.println("Work done by " + this.hashCode());
	}
}
