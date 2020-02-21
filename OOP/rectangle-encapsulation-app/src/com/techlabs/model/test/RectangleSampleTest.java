package com.techlabs.model.test;
import com.techlabs.model.*;
public class RectangleSampleTest {
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		System.out.println("Height = "+rect.readHeight());
		System.out.println("Width = "+rect.readWidth());
		System.out.println(rect.changeWidth(10)); //Print is not applicable for void
	}
}
