package srp.solution2;

public class InvoicePrinter {
	public void print(Invoice invoice) {
		System.out.println("Bill Details : ");
		System.out.println("MRP = " + invoice.getCost() + "\nDiscount = "
				+ invoice.getDiscountPercentage() + "%\nAfter Discount = "
				+ invoice.calculateDiscountAmount() + "\nTax = "
				+ invoice.calculateTax() + "\nTotal Amount = "
				+ invoice.calculateTotalCost());
	}
}
