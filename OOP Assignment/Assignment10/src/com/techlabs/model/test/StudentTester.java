package com.techlabs.model.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.techlabs.model.Branch;
import com.techlabs.model.Student;

public class StudentTester {

	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Student student = new Student(145678, "Mumbai", "08/21/1998",
			Branch.ELECTRICAL);

	@Test
	public void test_checkAddressIsMumbai() {
		assertEquals("Mumbai", student.getAddress());
	}

	@Test
	public void test_checkBranchIsElectrical() {
		assertEquals(Branch.ELECTRICAL, student.getBranch());
	}

	@Test
	public void test_checkDateOfBirth() throws ParseException {

		assertEquals(formatter.parse("08/21/1998"), student.getDateOfBirth());

	}
}
