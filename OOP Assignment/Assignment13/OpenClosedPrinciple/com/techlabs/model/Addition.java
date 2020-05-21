package com.techlabs.model;

public class Addition implements IOperation {
	private double firstOperand;
	private double secondOperand;
	private double result = 0.0;

	public Addition(double firstOperand, double secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}

	@Override
	public double performOperation() {
		result = firstOperand + secondOperand;
		return result;
	}
}