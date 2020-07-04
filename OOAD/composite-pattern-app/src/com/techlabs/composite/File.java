package com.techlabs.composite;

public class File implements IDiskItem {

	private String name;
	private int size;
	private String extension;

	public File(String name, int size, String extension) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.size = size;
		this.extension = extension;

	}

	@Override
	public String show(int level) {
		// TODO Auto-generated method stub
		return "|-> " + name + "" + extension + "(" + size + "MB)";
	}

}
