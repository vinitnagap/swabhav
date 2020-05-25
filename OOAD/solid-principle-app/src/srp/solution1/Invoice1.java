package srp.solution1;

import java.util.UUID;

public class Invoice1 {

	private UUID id;
	private String name;
	private double cost;
	private float discountPercentage;
	private final static float GST = 5f;

	public Invoice1(String id, String name, double cost,
			float discountPercentage) {
		this.id = UUID.fromString(id);
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}

	public String getId() {
		return id.toString();
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

}
