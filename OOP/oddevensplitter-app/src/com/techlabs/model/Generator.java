package com.techlabs.model;

import java.util.ArrayList;

public class Generator {

	ArrayList even = new ArrayList();
	ArrayList odd = new ArrayList();

	public void oddEvenSplitter(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				even.add(i);
			else
				odd.add(i);
		}
	}

	public ArrayList getEvenNumbers() {
		return even;
	}

	public ArrayList getOddNumbers() {
		return odd;
	}

}
