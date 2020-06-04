package dip.solution1.test;

import dip.solution1.JsonLogger;
import dip.solution1.TaxCalculator;

public class DIPTest {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(new JsonLogger());
		System.out.println(calc.calculateTax(10, 5));
		System.out.println(calc.calculateTax(0, 0));
	}
}
