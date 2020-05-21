package com.techlabs.model.test;

import com.techlabs.model.Addition;
import com.techlabs.model.ICalculator;
import com.techlabs.model.IOperation;
import com.techlabs.model.SimpleCalculator;
import com.techlabs.model.Subtraction;

public class OCPTest {

	public static void main(String[] args) {
		IOperation addition = new Addition(20, 10);
		IOperation subtration = new Subtraction(20, 10);
		ICalculator calculator = new SimpleCalculator();
		calculator.calculate(addition);
		calculator.calculate(subtration);
	}

}
