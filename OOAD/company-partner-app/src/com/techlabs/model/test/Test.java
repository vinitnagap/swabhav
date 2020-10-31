package com.techlabs.model.test;

import com.techlabs.model.Company;
import com.techlabs.model.Partner;
import com.techlabs.model.Senior;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company aurionpro = new Company(101, "AurionPro");
		Partner swabhav = new Partner(111, "Swabhav", 10);
		Partner google = new Partner(222, "Google", 100);
		Senior sachin = new Senior(1, "sachin", "developer", 5);
		Senior virat = new Senior(2, "virat", "tester", 2);
		Senior dhoni = new Senior(3, "dhoni", "ceo", 25);

		aurionpro.addPartner(swabhav);
		aurionpro.addPartner(google);
		aurionpro.addSenior(dhoni);
		google.addSenior(virat);
		swabhav.addSenior(sachin);
		printInfo(aurionpro);
		printInfo(swabhav);
		printInfo(google);
	}

	private static void printInfo(Company company) {
		System.out.println("Company Details");
		System.out.println("Id = " + company.getId() + " Name = " + company.getName());
		System.out.println("Partner Details");
		for (Partner partner : company.getPartners()) {
			System.out.println("Id = " + partner.getId() + " Name = " + partner.getName() + " Employees = "
					+ partner.getTotal_emp());
		}
		System.out.println("Senior Details");
		for (Senior senior : company.getSeniors()) {
			System.out.println("Id = " + senior.getId() + " Name = " + senior.getName() + " Designation = "
					+ senior.getDesignation() + " Experience " + senior.getYearly_experience());
		}
		System.out.println();
	}

	private static void printInfo(Partner partner) {
		System.out.println("Company Details");
		System.out.println(
				"Id = " + partner.getId() + " Name = " + partner.getName() + " Employees = " + partner.getTotal_emp());
		System.out.println("Senior Details");
		for (Senior senior : partner.getSeniors()) {
			System.out.println("Id = " + senior.getId() + " Name = " + senior.getName() + " Designation = "
					+ senior.getDesignation() + " Experience " + senior.getYearly_experience());
		}
		System.out.println();
	}
}
