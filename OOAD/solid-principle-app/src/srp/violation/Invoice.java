package srp.violation;

import java.util.UUID;

public class Invoice {

	private UUID id;
	private String name;
	private double cost;
	private float discountPercentage;
	private final static float GST = 5;

	public Invoice(String id, String name, double cost, float discountPercentage) {
		this.id = UUID.fromString(id);
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}

	public double calculateTax() {
		return cost * GST/100;
	}

	public double calculateDiscountAmount() {
		return cost * (100 - discountPercentage) / 100;
	}

	public double calculateTotalCost() {
		return calculateDiscountAmount() + calculateTax();
	}

	public void print() {
		System.out.println("Bill Details : ");
		System.out.println("MRP = " + cost + "\nDiscount = "
				+ discountPercentage + "%\nAfter Discount = "
				+ calculateDiscountAmount() + "\nTax = " + calculateTax()
				+ "\nTotal Amount = " + calculateTotalCost());
	}
}
