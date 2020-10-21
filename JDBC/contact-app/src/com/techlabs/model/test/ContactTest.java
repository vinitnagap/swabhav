package com.techlabs.model.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.techlabs.model.Contact;

public class ContactTest {

	public static void main(String[] args) throws SQLException {

		Contact details = new Contact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice: \n1. Display\n2. Add\n3. Delete");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			details.display();
			break;
		}
		case 2: {
			System.out.println("Enter details to add");
			System.out.println("Enter First Name");
			String fname = sc.next();
			System.out.println("Enter Last Name");
			String lname = sc.next();
			System.out.println("Enter Phone No.");
			String phone = sc.next();
			System.out.println("Enter Email");
			String email = sc.next();
			details.add(fname, lname, phone, email);
			break;
		}
		case 3: {
			System.out.println("Enter First Name to Delete");
			String data = sc.next();
			details.delete(data);
			break;
		}
		}
		sc.close();

	}

}
