package isp.solution1;

public class Robot implements IDoWork {

	@Override
	public void startWork() {
		System.out.println("Robot start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop working");
	}

}
