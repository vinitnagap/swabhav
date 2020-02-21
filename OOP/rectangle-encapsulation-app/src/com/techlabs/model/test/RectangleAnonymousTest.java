package com.techlabs.model.test;
import com.techlabs.model.*;
public class RectangleAnonymousTest {
	public static void main(String[] args){
		System.out.println(new Rectangle().readHeight());
		System.out.println(new Rectangle().readWidth());
		new Rectangle().changeHeight(10);
		new Rectangle().changeWidth(50);
		printInfo(new Rectangle());
	}
	
	public static void printInfo(Rectangle r) {
		System.out.println("Width = " + r.readWidth());
		System.out.println("Height = " + r.readHeight());
		int Area = r.readWidth() * r.readHeight();
		System.out.println("Area = "+Area);
	}
}
