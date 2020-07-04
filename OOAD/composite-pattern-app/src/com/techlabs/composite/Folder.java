package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {

	private String name;
	private List<IDiskItem> childrens = new ArrayList<>();

	public Folder(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public String show(int index) {
		index++;
		String folderItems = this.name + "\n";
		for (IDiskItem children : childrens) {
			if (children instanceof File)
				folderItems = folderItems + separator(index) + children.show(index) + "\n";
			else
				folderItems = folderItems + separator(index) + children.show(index);

		}
		return folderItems;

	}

	public String separator(int index) {
		String space = "";
		for (int i = 0; i < index; i++) {
			space = space + "    ";

		}
		return space;
	}

	public void addChild(IDiskItem children) {
		childrens.add(children);
	}

}
