package com.techlabs.model;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public int getArea() {
		return height * width;
	}

}
