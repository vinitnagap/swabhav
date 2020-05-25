package lsp.violation.test;

import lsp.violation.Sqaure;
import lsp.violation.Rectangle;

public class LSPTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(20, 10);
		Rectangle square = new Sqaure(10);
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		System.out.println("Area of Square : " + square.calculateArea());
		shouldNotChangeWidth_IfHeightIsModified(rectangle);
		shouldNotChangeWidth_IfHeightIsModified(new Sqaure(50));
	}

	public static void shouldNotChangeWidth_IfHeightIsModified(
			Rectangle rectangle) {
		int beforeWidth = rectangle.getWidth();
		rectangle.setHeight(rectangle.getHeight() + 10);
		int afterWidth = rectangle.getWidth();

		System.out.println(beforeWidth == afterWidth);
	}
}
