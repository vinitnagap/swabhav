package srp.solution1;

public class InvoiceCalculator {

	private Invoice1 invoice;
	private final static float GST = 5f;

	public InvoiceCalculator(Invoice1 invoice) {
		this.invoice = invoice;
	}

	public double calculateTax() {
		return invoice.getCost() * GST / 100;
	}

	public double calculateDiscountAmount() {
		return invoice.getCost() * (100 - invoice.getDiscountPercentage())
				/ 100;
	}

	public double calculateTotalCost() {
		return calculateDiscountAmount() + calculateTax();
	}

	public Invoice1 getInvoice() {
		return invoice;
	}

	public float getGST() {
		return GST;
	}
}
