package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.techlabs.model.Professor;

public class ProfessorTester {

	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Professor professor = new Professor(125689, "Kanpur", "08/22/1968", 1000);

	@Test
	public void test_checkSalaryPerHouris1000() {
		assertEquals(1000, professor.getSalaryPerHour(), .0);

	}

	@Test
	public void test_checkNetSalaryis15000_forSalaryPerHour1000_HoursWorked15() {
		professor.updateSalary(15);
		assertEquals(15000, professor.getNetSalary(), .0);
	}

	@Test
	public void test_checkDateOfBirth() throws ParseException {

		assertEquals(formatter.parse("08/22/1968"), professor.getDateOfBirth());

	}
}
