package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 12. Thia App will present the mutiplication table of a provided number and at the end will 
// confirm to user if user wants to perform a another calcuation.


public class Exerc12 {

	public static void main(String[] args) {

		int multiplier, multiTable;
		boolean operation = true;
		Scanner sc = new Scanner(System.in);

		while (operation) {
			System.out.println("Please, enter the number you want to know about the multiplication table:");
			multiplier = sc.nextInt();
			System.out.println("\nMultiplication table: " + multiplier + "\n");
			for (multiTable = 0; multiTable <= 10; multiTable++) {
				System.out.println(multiTable + "x" + multiplier + " = " + (multiTable * multiplier));
			}

			System.out.println("\nDo you want to process a new Multiplier table? [Y / N]");
			char option = sc.next().strip().toLowerCase().charAt(0);
			if (option == 'n') {
				operation = false;
				System.out.println("Thank you for your prefference.");
			}

		}
		sc.close();

	}
}
