package com.techlabs.basics;

public class ArgumentTest {

	public static void main(String[] names) {
		
		System.out.println(names.length);
		for (String name : names) {
			name = name.concat("aurionpro");
			System.out.println(name);
		}
		System.out.println(names);
		System.out.println(names[0]);
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].concat("aurionpro");
		}
		System.out.println(names[0]);
		System.out.println(names);
		String[] namescopy = names;
		for (int j = 0; j < namescopy.length ; j++){
			System.out.println(namescopy[j]);
			namescopy[j] = names[j];
		}
		namescopy[2]="swabhavTechlabs";
		System.out.println(names[2]);
		System.out.println(namescopy);
		//System.out.println(namescopy=names);
		
	}

}
