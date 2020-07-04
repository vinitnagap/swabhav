package com.techlabs.composite;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder root = new Folder("Movies");
		root.addChild(new File("abc", 100, ".avi"));
		Folder action = new Folder("Action");
		root.addChild(action);
		action.addChild(new File("lmn", 60, ".avi"));
		root.addChild(new File("pqr", 200, ".avi"));
		System.out.println(root.show(0));
	}

}
