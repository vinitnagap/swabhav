package com.techlabs.objectcalisthenics;

public class WithoutRule1Test {
	public static void main(String[] args) { int val = 3, x = 2;
		if (val == x) 
		{
			x++;
			System.out.println("Incrementing x");
		}System.out.println("val is " + val);

	}

}
