package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robots don't eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robots don't eat");
	}

}
