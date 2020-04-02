package com.techlabs.model.test;

import com.techlabs.model.*;
import java.io.*;

public class SerializationTest {
	public static void main(String[] args) {
		Account.setMinimumBalance(100);
		Account object = new Account(101, "abc", 5000);
		object.deposit(2000);
		String filename = "file.data";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

	}
}
