package com.techlabs.model;

public class Database {

	public void doDBOperations(ICrudable obj) {
		obj.create();
		obj.delete();
		obj.read();
		obj.update();
	}
}
