package com.techlabs.basics;

public class ArrayToFunctionTest {
	public static void main(String[] args) {
		double[] cgpaList = { 7.8, 8.3, 7.81 };
		upgradeCgpa(cgpaList);
		for (double cgpa : cgpaList) {
			System.out.println(cgpa);
		}

	}

	public static void upgradeCgpa(double cgpaList[]) {
		for (int i = 0; i < cgpaList.length; i++) {
			cgpaList[i] = cgpaList[i] + cgpaList[i] * 0.1;
		}
	}

}
