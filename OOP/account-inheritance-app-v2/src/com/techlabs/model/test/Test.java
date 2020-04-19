package com.techlabs.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import com.techlabs.model.*;

public class Test {

	public static void main(String args[]) throws ParseException, IOException {
		Account accounts[] = new Account[5];
		accounts[0] = new SavingAccount(10, "abc", 15000, "01/23/2019",
				"01/01/1976");
		accounts[1] = new SavingAccount(20, "xyz", 32000, "01/01/2020",
				"10/01/1998");
		accounts[2] = new CurrentAccount(30, "pqr", 55000, "01/16/2016",
				"03/26/1995");
		accounts[3] = new CurrentAccount(40, "mno", 25000, "12/25/2015",
				"09/10/1998");
		accounts[4] = new SavingAccount(50, "qwe", 5000, "12/13/2020",
				"31/12/1956");

		printInfo(findRichestAccountHolder(accounts));
		printInfo(findYoungAccountHolders(accounts, 23));
		writeToCsv(accounts);
	}

	public static void printInfo(Account[] acc) {

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null) {
				printInfo(acc[i]);
			}
		}

	}

	public static void printInfo(Account acc) {
		System.out.println("Acc No.\tName\tBalanace\tAge");
		System.out.println(acc.getAccno() + "\t" + acc.getName() + "\t"
				+ acc.getBalance() + "\t\t" + acc.getAge());
	}

	public static Account findRichestAccountHolder(Account[] acc) {
		Account richestAcc = acc[0];

		for (int i = 0; i < acc.length; i++) {
			double balance = richestAcc.getBalance();
			if (balance < acc[i].getBalance()) {
				richestAcc = acc[i];
			}
		}
		return richestAcc;
	}
	
	//private static int getCountOfYoungAccHolders()

	private static Account[] findYoungAccountHolders(Account[] acc, int age) {
		Account youngAcc[] = new Account[5];
		for (int i = 0; i < acc.length; i++) {
			if (age > acc[i].getAge()) {
				youngAcc[i] = acc[i];
			}

		}
		return youngAcc;

	}

	public static void writeToCsv(Account[] acc) throws IOException {
		FileWriter fw = new FileWriter("BankAccountDetails.csv");
		fw.write("Type,Accno,Name,Balance,Creation Date,Age ");
		fw.write('\n');
		for (Account account : acc) {
			fw.write(account.getAccountType() + "," + account.getAccno() + ","
					+ account.getName() + "," + account.getBalance() + ","
					+ account.getCurrentDate() + "," + account.getAge() + "\n");
			fw.write('\n');
		}
		fw.close();

	}

}
