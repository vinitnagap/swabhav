package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;

	public Person(String pname, int page, String pgender, float pheight,
			float pweight) {
		name = checkName(pname);
		age = checkValue(page);
		gender = checkGender(pgender);
		height = checkValue(pheight);
		weight = checkValue(pweight);
	}

	private int checkValue(int page) {
		if (page < 1) {
			page = 1;
			return page;
		}
		return page;
	}

	private float checkValue(float value) {
		if (value < 1) {
			value = 1;
			return value;
		}
		return value;
	}

	private String checkGender(String pgender) {
		if (pgender == null) {
			return "others";
		}
		if (pgender.equalsIgnoreCase("male")
				|| pgender.equalsIgnoreCase("female")) {
			return pgender.toLowerCase();
		}
		return "others";
	}

	private String checkName(String pname) {
		if (pname == null) {
			return "Unknown";
		}
		return pname;
	}

	public void doWorkout() {
		weight = (weight - weight * 0.02f);
	}

	public void doEat() {
		weight = (weight + weight * 0.05f);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

}
