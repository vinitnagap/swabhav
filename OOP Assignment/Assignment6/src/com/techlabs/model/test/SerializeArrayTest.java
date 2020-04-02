package com.techlabs.model.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.model.Account;

public class SerializeArrayTest {
	public static void main(String[] args) {
		Account.setMinimumBalance(100);
		Account[] account = new Account[3];
		account[0] = new Account(101, "abc", 5000);
		account[1] = new Account(102, "xyz", 5000);
		account[2] = new Account(103, "mno", 5000);
		account[1].deposit(2000);
		String filename = "file1.data";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			for (Account accounts : account) {
				out.writeObject(accounts);
			}
			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

	}
}
