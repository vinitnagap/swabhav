package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private GenderType gender;
	private float height;
	private float weight;

	public Person(String pname, int page, GenderType pgender, float pheight,
			float pweight) {
		name = checkName(pname);
		age = checkValue(page);
		height = checkValue(pheight);
		weight = checkValue(pweight);
		gender = pgender;
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

	public GenderType getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

}
