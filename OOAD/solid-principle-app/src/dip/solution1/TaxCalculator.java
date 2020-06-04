package dip.solution1;

public class TaxCalculator {

	private ILogger log;

	public TaxCalculator(ILogger log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {
		try {
			int tax = amt / rate;
			return tax;
		} catch (RuntimeException e) {
			log.log(e.toString());
			return -1;
		}

	}
}
