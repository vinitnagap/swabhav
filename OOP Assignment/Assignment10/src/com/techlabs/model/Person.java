package com.techlabs.model;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public abstract class Person {
	private int id;
	private String address;
	private Date dateOfBirth;

	public Person(int id, String address, String dateOfBirth) {
		this.id = id;
		this.address = address;
		this.dateOfBirth = validateDate(dateOfBirth);

	}

	private Date validateDate(String dob) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date dateOfBirth;
		try {

			dateOfBirth = formatter.parse(dob);

		} catch (Exception e) {
			System.out.println("Enter date in mm/dd/yyyy format");
			Scanner sc = new Scanner(System.in);
			dateOfBirth = validateDate(sc.nextLine());

		}
		return dateOfBirth;

	}

	public String getAddress() {
		return address;

	}

	public int getId() {
		return id;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

}
