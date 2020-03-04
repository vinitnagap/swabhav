package com.techlabs.thiskeyword;

public class WithoutThis {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.setValues(10);
		t.show();
	}
}

class Test1 {
	int i;

	void setValues(int i) {
		i = i;
	}

	void show() {
		System.out.println(i);
	}
}
