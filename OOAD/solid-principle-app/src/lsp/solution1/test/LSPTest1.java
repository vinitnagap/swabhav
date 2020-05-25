package lsp.solution1.test;

import lsp.solution1.Rectangle;
import lsp.solution1.Square;

public class LSPTest1 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(20, 10);
		Square square = new Square(10);
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		System.out.println("Area of Square : " + square.calculateArea());

	}

}
