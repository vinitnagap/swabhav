package dryprinciple;

public class WithoutDry {

	public static void main(String[] args) {
		Mechanic1 m = new Mechanic1();
		m.serviceCar();
		m.serviceBike();
	}
}

class Mechanic1{

	public void serviceCar() {

		System.out.println("Servicing Car now");
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

	}

	public void serviceBike() {

		System.out.println("Servicing Bike now");
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

	}

}