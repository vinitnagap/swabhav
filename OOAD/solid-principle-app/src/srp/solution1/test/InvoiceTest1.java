package srp.solution1.test;

import srp.solution1.Invoice1;
import srp.solution1.InvoiceCalculator;

public class InvoiceTest1 {
	public static void main(String[] args) {
		InvoiceCalculator invoice = new InvoiceCalculator(new Invoice1(
				"9fb01de0-1d63-4d09-9415-90e0b4e93b9a", "Ram", 500, 10f));
		printInfo(invoice);
	}

	private static void printInfo(InvoiceCalculator invoice) {
		Invoice1 bill = invoice.getInvoice();
		System.out.println("Id = " + bill.getId() + "\nName = "
				+ bill.getName() + "\nCost = " + bill.getCost()
				+ "\nDiscount Percentage = " + bill.getDiscountPercentage()
				+ "\nGST = " + invoice.getGST() + "\nTotal Cost = "
				+ invoice.calculateTotalCost());
	}
}
