package dip.solution1;

public class JsonLogger implements ILogger {

	@Override
	public void log(String errorDetails) {
		System.out.println("Writing data in JSON file " + errorDetails);

	}

}
