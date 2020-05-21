package com.techlabs.model.test;

import com.techlabs.model.Cat;
import com.techlabs.model.IAnimal;
import com.techlabs.model.IPet;
import com.techlabs.model.Tiger;

public class ISPTest {

	public static void main(String[] args) {
		IPet pet = new Cat();
		pet.feed();
		pet.groom();
		
		IAnimal animal = new Tiger();
		animal.feed();

	}

}
