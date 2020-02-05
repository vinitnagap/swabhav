package com.techlabs.basics;

public class StringArrayTest {

	public static void main(String[] args) {
		String[] names = { "Vinit", "Prasad", "Jay", "Tanmay", "Tejashree",
				"Pawan", "Tejal", "Murtaza", "Pawan" };

		System.out.println("Normal for loop");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("Enhanced for loop");
		System.out.println("Names containing 'a'");
		for (String a : names) {
			System.out.println(a);
		}
		
		System.out.println("Names containing 'a'");
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("a")) {
				System.out.println(names[i]);
			}
		}
		
		
		int temp=0;
		for(int i=1;i<names.length;i++)
		{
			if(names[temp].length()< names[i].length()){
				temp=i;
			}
		}
		System.out.println("Maximum="+names[temp]);
	
	}
	


}
