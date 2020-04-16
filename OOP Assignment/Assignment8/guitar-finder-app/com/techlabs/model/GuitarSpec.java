package com.techlabs.model;

public class GuitarSpec {
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	private String model;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings,
			Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}

	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals(""))
				&& (!model.equals(otherSpec.model)))
			return false;
		if (type != otherSpec.type)
			return false;
		if (numStrings != otherSpec.numStrings)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public Builder getBuilder() {
		return builder;
	}
}
