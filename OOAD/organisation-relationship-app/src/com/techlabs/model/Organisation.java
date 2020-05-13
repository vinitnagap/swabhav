package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Organisation {

	private UUID id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Talent> talents = new ArrayList<Talent>();

	public Organisation(UUID id, String name, String registrationDate)
			throws ParseException {
		this.id = id;
		this.name = name;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		this.registrationDate = (Date) sdf.parse(registrationDate);
	}

	public void addPartner(Partner partner) {
		partners.add(partner);

	}

	public void addTalent(Talent talent, Partner partner) {
		talents.add(talent);
		if (partner != null)
			partner.addTalent(talent);
	}

	public int partnerCount() {
		return partners.size();
	}

	public Iterable<Talent> getTalents() {
		return talents;
	}

	public Iterable<Partner> getPartners() {
		return partners;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}
}
