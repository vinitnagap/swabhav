package com.techlabs.model.test;

import com.techlabs.model.BackendDeveloper;
import com.techlabs.model.FrontendDeveloper;
import com.techlabs.model.IDeveloper;

public class DIPTest {

	public static void main(String[] args) {
		IDeveloper developer1 = new FrontendDeveloper();
		developer1.develop();

		IDeveloper developer2 = new BackendDeveloper();
		developer2.develop();
	}

}
