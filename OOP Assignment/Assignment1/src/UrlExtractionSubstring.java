package com.techlabs.basics;

public class UrlExtractionSubstring {

	public static void main(String[] args) {

		//String str = "http://www.swabhavtechlabs.com?developer=vinit@role=architect";
		// String str = "http://www.swabhavtechlabs.com?developer=vinit";
		// String str = "http://www.swabhavtechlabs.com?role=architect";
		String str = "http://www.swabhavtechlabs.com?role=architect@developer=vinit";

		/*
		 * String company = ""; String developer = ""; String role = ""; company
		 * = str.substring(11,26); System.out.println("Company = " + company);
		 * developer = str.substring(31,46); System.out.println("" +developer );
		 * if(str.substring(47)==null){ System.out.println("Role not found"); }
		 * else{ role = str.substring(47,61); System.out.println("" + role); }
		 */
		int start = str.indexOf("www.");
		int end = str.indexOf(".com");
		System.out.println("Company = " + str.substring(start + 4, end));

		start = str.indexOf("developer");
		end = str.indexOf("@role");
		// System.out.println("Developer= "+str.substring(start,end));

		if (start != -1) {
			if (end != -1) {
				System.out.println("Developer:"
						+ str.substring(start + 10, end));
			} else
				System.out.println("Developer:" + str.substring(start + 10));
		}
		start = str.indexOf("role");
		end = str.indexOf("@developer");
		if (start != -1) {
			if (end != -1) {
				System.out.println("role=" + str.substring(start + 5, end));
			} else {
				System.out.println("role=" + str.substring(start + 5));
			}

		}

	}
}