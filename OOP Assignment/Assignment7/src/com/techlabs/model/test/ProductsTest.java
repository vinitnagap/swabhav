package com.techlabs.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductsTest {

	public static void main(String args[]) throws IOException {

		String[][] products = new String[10][4];
		int totalRows = 10;
		int totalColumns = loadFile(products);
		display(products, totalRows, totalColumns);
		sellingPrice(products, totalRows, totalColumns);

	}

	public static int loadFile(String[][] products) throws IOException {
		String line = "";
		int rows = 0;
		String[] product = null;
		BufferedReader br = new BufferedReader(new FileReader("products.csv"));
		while ((line = br.readLine()) != null) {
			product = line.split(",");
			for (int j = 0; j < product.length; j++) {
				products[rows][j] = java.lang.String.valueOf(product[j]);
			}
			rows++;

		}

		return product.length;
	}

	public static void display(String[][] products, int totalrows,
			int totalcolumns) {
		for (int row = 0; row < totalrows; row++) {
			if (products[row][1] != null) {
				for (int column = 0; column < totalcolumns; column++) {
					if (products[row][column] != null)
						System.out.print(products[row][column] + " ");

				}
				System.out.println();
			}
		}
	}

	public static void sellingPrice(String[][] products, int totalrows,
			int totalcolumns) {
		double sellingPrice = 0;
		System.out.println("After Discount Price");
		System.out.println("ID   Price");
		for (int row = 1; row < totalrows; row++) {
			if (products[row][1] != null && products[row][2] != null
					&& products[row][3] != null) {
				for (int column = 0; column < totalcolumns; column++) {

					double discount = Double.parseDouble(products[row][2]);
					double price = Double.parseDouble(products[row][3]);
					sellingPrice = discount * price;

				}

				System.out.println(products[row][0] + "  " + sellingPrice);
			}
		}
	}

}