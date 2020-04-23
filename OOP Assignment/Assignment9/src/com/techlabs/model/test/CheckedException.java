package com.techlabs.model.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws Exception {
		int n = 0;
		System.out.println("Enter a no. :");

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			br.close();
		}
		System.out.println(n);
	}
}
