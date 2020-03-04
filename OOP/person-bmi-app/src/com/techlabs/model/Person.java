package com.techlabs.model;

public class Person {
	private float height;
	private float weight;

	public Person(float pheight, float pweight) {
		height = checkValue(pheight);
		weight = checkValue(pweight);
	}

	private float checkValue(float value) {
		if (value < 1) {
			value = 1;
			return value;
		}
		return value;
	}

	public float calculateBmi() {
		float newheight = 0.3048f * height;
		float bmi = weight / (newheight * newheight);
		return bmi;
	}

	public String bmiCategory() {
		float newheight = 0.3048f * height;
		float bmi = weight / (newheight * newheight);

		if (bmi < 15) {
			return "Very severely underweight";
		} else if (bmi >= 15 && bmi < 16) {
			return "Severely underweight";
		} else if (bmi >= 16 && bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else if (bmi >= 30 && bmi < 35) {
			return "Moderately obese";
		} else if (bmi >= 35 && bmi < 40) {
			return "Severely obese";
		}
		return "very severely obese";

	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

}
