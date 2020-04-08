package com.techlabs.model.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductsTest {

	public static void main(String[] args) {
		String fileName = "products.csv";
		File file = new File(fileName);
		try {
			Scanner inputStream = new Scanner(file);
			//inputStream.useDelimiter("\n");
			inputStream.next();
			while (inputStream.hasNext()) {
				String data = inputStream.next();
				data = data.trim();
				String[] values = data.split(",");

				//System.out.println(values[0]);
				System.out.println(data);
			}
			inputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
