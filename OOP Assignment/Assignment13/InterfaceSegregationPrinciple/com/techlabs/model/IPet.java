package com.techlabs.model;

public interface IPet extends IAnimal {

	@Override
	void feed();

	void groom();
}
