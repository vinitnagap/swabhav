package dip.violation;

public class TaxCalculator {

	private LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {
		try {
			int tax = amt / rate;
			return tax;
		} catch (RuntimeException e) {
			if (log.equals(LogType.XML))
				new XmlLogger().log(e.toString());
			if (log.equals(LogType.JSON))
				new JsonLogger().log(e.toString());
			if (log.equals(LogType.TXT))
				new TextLogger().log(e.toString());
			return -1;
		}

	}
}
