package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle rect;
		rect = new Rectangle();
		rect.changeWidth(50);
		rect.changeHeight(10);
		System.out.println("Width = " + rect.readWidth());
		System.out.println("Height = " + rect.readHeight());
		
		rect.changeWidth(-20);
		rect.changeHeight(120);
		System.out.println("Width = " + rect.readWidth());
		System.out.println("Height = " + rect.readHeight());

	}
}
