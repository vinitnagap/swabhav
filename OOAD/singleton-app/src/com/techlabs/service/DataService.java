package com.techlabs.service;

public class DataService {

	private static DataService bucket;

	private DataService() {
		System.out.println("Service Created");
	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
			return bucket;
		}
		return bucket;
	}

	public void doSomething() {
		System.out.println("Work done by " + this.hashCode());
	}
}
