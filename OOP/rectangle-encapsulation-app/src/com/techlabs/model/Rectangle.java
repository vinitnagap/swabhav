package com.techlabs.model;

public class Rectangle {
	private int width, height;

	public void changeWidth(int pwidth) {
		if (pwidth >= 1 && pwidth <= 100) {
			width = pwidth;
			return;

		} else if (pwidth < 1) {
			width = 1;
			return;
		}
		width = 100;
	}

	public void changeHeight(int pheight) {
		if (pheight >= 1 && pheight <= 100) {
			height = pheight;
			return;

		} else if (pheight < 1) {
			height = 1;
			return;
		}
		height = 100;
	}

	public int readWidth() {
		return width;
	}

	public int readHeight() {
		return height;
	}

}
