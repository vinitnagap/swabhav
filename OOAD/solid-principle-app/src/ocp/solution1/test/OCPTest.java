package ocp.solution1.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class OCPTest {
	public static void main(String args[]) {
		FixedDeposit fd = new FixedDeposit(156489, "Ram", 500000, 4,
				FestivalType.DIWALI);
		System.out.println("Simple Interest = " + fd.calculateSimpleInterest());
	}
}
