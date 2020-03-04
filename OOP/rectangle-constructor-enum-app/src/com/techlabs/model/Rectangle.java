package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private ColorType color;

	public Rectangle(int pwidth, int pheight, ColorType pcolor) {
		width = checkLength(pwidth);
		height = checkLength(pheight);
		color = pcolor;
	}

	public Rectangle(int pwidth, int pheight) {
		width = checkLength(pwidth);
		height = checkLength(pheight);
		color = color.RED;
	}

	public int calculateArea() {
		int area = width * height;
		return area;
	}

	private int checkLength(int length) {
		if (length <= 0) {
			length = 1;
			return length;
		}
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ColorType getColor() {
		return color;
	}

}
