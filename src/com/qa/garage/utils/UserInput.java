package com.qa.garage.utils;

import java.util.Scanner;

public class UserInput {

	private static Scanner scanner = new Scanner(System.in);

	public static String getString() {
		return scanner.nextLine();
	}

	public static Integer getInt() {
		Integer i = null;
		do {
			try {
				i = Integer.parseInt(getString());
			} catch (NumberFormatException nfe) {
				System.out.println("ERROR - Please enter a number!");
			}
		} while (i == null);

		return i;
	}

	public static void close() {
		scanner.close();
	}

}
