package com.techlabs.model.test;

import com.techlabs.model.*;

public class ManTest {
	public static void main(String[] args) {
		// case1();// 3
		// case2();// 4
		// case3();
		// atThePark(new Man());
		// atThePark(new Boy());
		// atThePark(new Kid());
		// atThePark(new Infant());
		case5();
	}

	public static void case1() {
		Man x;
		x = new Man();
		x.play();
	}

	public static void case2() {
		Boy y;
		y = new Boy();
		y.play();

	}

	public static void case3() {
		Man x;
		x = new Boy();
		x.play();

	}

	public static void atThePark(Man x) {
		System.out.println("At the park");
		x.play();
	}

	public static void case5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());

		x = "hello";
		System.out.println(x.getClass());

		x = 10 > 20;
		System.out.println(x.getClass());

		x = new Integer(20);
		System.out.println(x.getClass());
	}
}
