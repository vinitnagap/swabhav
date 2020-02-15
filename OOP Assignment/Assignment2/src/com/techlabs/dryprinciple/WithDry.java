package com.techlabs.dryprinciple;

public class WithDry {

	public static void main(String[] args) {
		Mechanic m = new Mechanic();
		m.serviceCar();
		m.serviceBike();
	}
}

class Mechanic {

	public void serviceCar() {

		System.out.println("Servicing Car now");
		performOtherTasks();
	}

	public void serviceBike() {

		System.out.println("Servicing Bike now");
		performOtherTasks();
	}

	public void performOtherTasks() {

		// do washing here
		// or do something else
		System.out.println("performing tasks");
		System.out.println("Check for any broken parts");
		System.out.println("Do washing");
		System.out.println("Check Headlight");
		System.out.println("Check oil level");
		System.out.println("Check tire pressure");
		System.out.println("Check Brake pads");
		System.out.println("Check horn");
		System.out.println("Check air filter");
		System.out.println("Do a test drive");

		// do whatever you want to do in the servicing package
	}

}