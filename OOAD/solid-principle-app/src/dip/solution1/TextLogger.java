package dip.solution1;

public class TextLogger implements ILogger {

	@Override
	public void log(String errorDetails) {
		System.out.println("Writing data in TXT file " + errorDetails);

	}
}
