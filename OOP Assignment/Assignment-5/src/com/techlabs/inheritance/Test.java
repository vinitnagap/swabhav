package com.techlabs.inheritance;

abstract class Bike {
	abstract void run();

	void show() {
		System.out.println("Parent's show()");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely");
	}

	void show() {
		System.out.println("Child's show()");
	}

}

public class Test {
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.show();
	}
}
