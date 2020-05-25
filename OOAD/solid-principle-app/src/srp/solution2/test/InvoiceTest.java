package srp.solution2.test;

import srp.solution2.Invoice;
import srp.solution2.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice customer = new Invoice("9fb01de0-1d63-4d09-9415-90e0b4e93b9a",
				"Ram", 500, 10f);
		InvoicePrinter printInvoice = new InvoicePrinter();
		printInvoice.print(customer);
	}
}
