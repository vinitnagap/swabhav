package com.techlabs.model;

public class ClassA {

	private IDecoupler object;

	public ClassA(IDecoupler object) {
		this.object = object;
	}

	public void bar() {
		object.foo();
	}
}
