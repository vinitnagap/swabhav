package com.techlabs.basics;

import java.awt.peer.SystemTrayPeer;

public class WelcomeTest {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(0);
		System.out.println(20.22f);
		System.out.println('x');
		System.out.println("xyz");
		System.out.println(24.445);
		printInfo(20);
		printInfo(50.02);
		printInfo('t');
		printInfo(20.22f);
		printInfo("xyz");
	}

	public static void printInfo(int x) {
		System.out.println(x);
	}

	public static void printInfo(double d) {
		System.out.println(d);
	}

	public static void printInfo(char t) {
		System.out.println(t);
	}

	public static void printInfo(float f) {
		System.out.println(f);
	}

	public static void printInfo(String s) {
		System.out.println(s);
	}
}