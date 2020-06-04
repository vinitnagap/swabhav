package isp.solution1.test;

import isp.solution1.IDoWork;
import isp.solution1.IWorker;
import isp.solution1.Manager;
import isp.solution1.Robot;

public class ISPTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot b = new Robot();
		atTheWorkstation(m);
		atTheWorkstation(b);
		atTheCafeteria(m);
	}

	private static void atTheCafeteria(IWorker w) {
		System.out.println("At the Cafeteria");
		w.startEat();
		w.stopEat();
	}

	private static void atTheWorkstation(IDoWork w) {
		System.out.println("At the workstation");
		w.startWork();
		w.stopWork();
	}
}
