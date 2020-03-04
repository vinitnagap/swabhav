package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	public Rectangle(int pwidth, int pheight, String pcolor) {
		width = checkLength(pwidth);
		height = checkLength(pheight);
		color = checkColor(pcolor);
	}

	public Rectangle(int pwidth, int pheight) {
		width = checkLength(pwidth);
		height = checkLength(pheight);
		color = "red";
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

	private String checkColor(String pcolor) {
		if (pcolor == null) {
			return "red";
		}
		if (pcolor.equalsIgnoreCase("red") || pcolor.equalsIgnoreCase("blue")
				|| pcolor.equalsIgnoreCase("green")) {
			return pcolor.toLowerCase();
		}
		return "red";
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

}
