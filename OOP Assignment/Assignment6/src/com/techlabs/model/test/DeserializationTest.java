package com.techlabs.model.test;

import com.techlabs.model.*;
import java.io.*;

public class DeserializationTest {

	public static void main(String[] args) {

		String filename = "file.data";

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			Account object = (Account) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("Acc No. = " + object.getAccNo());
			System.out.println("Name = " + object.getName());
			System.out.println("Balance = " + object.getBalance());
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
