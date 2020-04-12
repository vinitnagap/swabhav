package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public abstract class Account {

	private int accno;
	private String name;
	protected double balance;
	private Date recordDate;
	private Date birthDate;
	private int age;
	protected String accountType;

	public Account(int accno, String name, double balance, String recordDate,
			String birthDate) throws ParseException {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		this.recordDate = sdf.parse(recordDate);
		this.birthDate = sdf.parse(birthDate);
		this.age = calculateAge();

	}

	private int calculateAge() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.birthDate);
		int year = calendar.get(Calendar.YEAR) ;
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		LocalDate birthDate = LocalDate.of(year, month, date);
		LocalDate todaysDate = LocalDate.now();
		Period age = Period.between(birthDate, todaysDate);
		return age.getYears();

	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public abstract void withdraw(double amt);

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public Date getCurrentDate() {
		return recordDate;
	}

	public Date getDateOfBirth() {
		return birthDate;
	}

	public int getAge() {
		return age;
	}

	public String getAccountType() {
		return accountType;
	}

}
