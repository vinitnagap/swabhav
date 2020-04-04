package com.techlabs.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Account;

public class DeserializeArrayTest {
	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		String filename = "file1.data";

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			accounts = (Account[])in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			for (Account account : accounts) {
				printInfo(account);

			}

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

	public static void printInfo(Account a) {
		System.out.println("Acc No. = " + a.getAccNo());
		System.out.println("Name = " + a.getName());
		System.out.println("Balance = " + a.getBalance());
		System.out.println();
	}
}
