package com.techlabs.readfile;

import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\vinit nagap\\Desktop\\swabhav\\Swabhav_Repo\\read.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
		br.close();
	}
}