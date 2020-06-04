package dip.solution1;

public class XmlLogger implements ILogger {
	
	@Override
	public void log(String errorDetails) {
		System.out.println("Writing data in XML file " + errorDetails);
	}
}
