package com.techlabs.model;

public class Man implements IMannerable {
	@Override
	public void wish(){
		System.out.println("Man is wishing");
	}
	
	@Override
	public void depart(){
		System.out.println("Man is saying hello");
	}

}
