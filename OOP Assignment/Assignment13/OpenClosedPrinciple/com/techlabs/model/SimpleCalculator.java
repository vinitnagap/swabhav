package com.techlabs.model;

public class SimpleCalculator implements ICalculator {
	@Override
	public void calculate(IOperation operation) {
		System.out.println(operation.performOperation());
	}
}