package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class ISPTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot b = new Robot();
		atTheWorkstation(m);
		atTheWorkstation(b);
		atTheCafeteria(b);
		atTheCafeteria(m);
	}

	private static void atTheCafeteria(IWorker w) {
		System.out.println("At the Cafeteria");
		w.startEat();
		w.stopEat();
	}

	private static void atTheWorkstation(IWorker w) {
		System.out.println("At the workstation");
		w.startWork();
		w.stopWork();
	}
}
