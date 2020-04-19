package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		Database db = new Database();
		db.doDBOperations(new CustomerDB());
	}
}
