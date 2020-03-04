package com.techlabs.writefile;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			File objFile = new File("file.txt");
			if (objFile.exists() == false) {
				if (objFile.createNewFile()) {
					System.out.println("File created successfully");
					return;
				}
				System.out.println("File creation failed!!");
				System.exit(0);
			}
			String text;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter text to write into file:");
			text = sc.nextLine();
			FileOutputStream fileOut = new FileOutputStream(objFile, true);
			fileOut.write(text.getBytes());
			fileOut.close();
			System.out.println("File saved");
			sc.close();
		} catch (Exception Ex) {
			System.out.println("Exception : " + Ex.toString());
		}
	}
}
