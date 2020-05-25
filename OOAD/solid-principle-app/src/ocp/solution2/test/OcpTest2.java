package ocp.solution2.test;

import ocp.solution2.Diwali;
import ocp.solution2.FixedDeposit;

public class OcpTest2 {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(156489, "Ram", 500000, 4,
				new Diwali());
		System.out.println("Simple Interest : " + fd.calculateSimpleInterest());
	}
}
