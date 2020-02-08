package com.techlabs.basics;

public class UrlExtractionSplit {
	
	public static void main(String[] args) {
		
		String str = "http://www.swabhavtechlabs.com?developer=vinit@role=architect";
	//	String str = "http://www.swabhavtechlabs.com?developer=vinit";
	//	String str = "http://www.swabhavtechlabs.com?role=architect";
	//	String str = "http://www.swabhavtechlabs.com?role=architect@developer=vinit";
		
		String[] terms = str.split("[@&?$+-]+");
		
		
	//	System.out.println("Website = " + terms[0]);
	//	System.out.println("" + terms[1]);
		
		//if(terms[2]==null){
		//	System.out.println("Role not present");
		//}
		
		//else System.out.println("" + terms[1]);
		
	    int start = str.indexOf("www.");
	    int end= str.indexOf(".com");
	    System.out.println("Company = "+str.substring(start+4,end));
	
	    for(int i=1;i<terms.length;i++)
	    {
	    	System.out.println(terms[i]);
	    }
	//	for(String a : terms){
	//		System.out.println(a);
	//	}
		// String[] parts = str.split("?");
		// String company = parts[20];
		// System.out.println(company);

	}
}
