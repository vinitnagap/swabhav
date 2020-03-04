package com.techlabs.thiskeyword;

public class WithThis {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.setValues(10);
		t.show();
	}
}

class Test2 {
	int i;

	void setValues(int i) {
		this.i = i;
	}

	void show() {
		System.out.println(i);
	}
}