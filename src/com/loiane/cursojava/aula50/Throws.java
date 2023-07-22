package com.loiane.cursojava.aula50;

import java.util.Scanner;

// class 50 - Using throws

public class Throws {

	public static void main(String[] args) {

		double number;

		System.out.println("Please enter with a double number: ");
		try {
			number = readNumber();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Information after the error be treated");

	}

	public static double readNumber() throws Exception {

		Scanner input = new Scanner(System.in);

		Double number = input.nextDouble();

		return number;
	}
}
