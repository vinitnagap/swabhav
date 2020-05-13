package com.techlabs.model.test;

import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.Organisation;
import com.techlabs.model.Partner;
import com.techlabs.model.Talent;

public class Test {

	public static void main(String[] args) throws ParseException {
		Organisation swabhav = new Organisation(UUID.randomUUID(), "Swabhav",
				"05/06/1992");
		Partner aurionPro = new Partner(UUID.randomUUID(), "Aurion Pro",
				5000000, 1500);
		Partner microsoft = new Partner(UUID.randomUUID(), "Microsoft",
				45000000, 4500);
		Partner google = new Partner(UUID.randomUUID(), "Google", 85555000,
				1600);

		swabhav.addPartner(aurionPro);
		swabhav.addPartner(google);
		swabhav.addPartner(microsoft);

		Talent vinit = new Talent(UUID.randomUUID(), "Vinit", 8.5, null, "C#");
		Talent jay = new Talent(UUID.randomUUID(), "Jay", 8.3,
				google.getName(), "Go");
		Talent prasad = new Talent(UUID.randomUUID(), "Prasad", 8.9,
				aurionPro.getName(), "Java");

		swabhav.addTalent(vinit, null);
		swabhav.addTalent(jay, google);
		swabhav.addTalent(prasad, aurionPro);

		printInfo(swabhav);
		printInfo(google);
	}

	private static void printInfo(Organisation organisation) {
		System.out.println(" Organisation Details :");
		System.out.println("Id :" + organisation.getId() + " Name :"
				+ organisation.getName() + " Registration Date :"
				+ organisation.getRegistrationDate() + " Total Partners :"
				+ organisation.partnerCount());
		System.out.println(" Partner Details :");
		for (Partner partner : organisation.getPartners()) {
			System.out.println("Id :" + partner.getId() + " Name :"
					+ partner.getName() + " Company Turnover :"
					+ partner.getCompanyTurnOver() + " Employee Strength :"
					+ partner.getEmpStrength());
		}

		System.out.println(" Talent Details :");
		for (Talent talent : organisation.getTalents()) {
			System.out.println("Talent id is: " + talent.getId()
					+ " Talent name is: " + talent.getName() + " Cgpa is :"
					+ talent.getCgpa() + " Talent associated to partner :"
					+ talent.getPartner() + " techstack is: "
					+ talent.getTechStack());
		}

	}

	public static void printInfo(Partner partner) {
		System.out.println(" Talent Details :");
		for (Talent talent : partner.getTalents()) {
			System.out.println("Talent id is: " + talent.getId()
					+ " Talent name is: " + talent.getName() + " Cgpa is :"
					+ talent.getCgpa() + " Talent associated to partner :"
					+ talent.getPartner() + " techstack is: "
					+ talent.getTechStack());

		}
	}
}
