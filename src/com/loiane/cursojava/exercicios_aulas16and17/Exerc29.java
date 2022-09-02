package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 29. This app will receive 2 numbers ( initial and final) and then will list
// only prime number in a row until the Final number.

public class Exerc29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numInit, numFin;
		int divisorAmount = 0;

		System.out.println("Please, enter the initial number:");
		numInit = sc.nextInt();

		System.out.println("Please, enter the final number:");
		numFin = sc.nextInt();

		System.out.println("Prime number list:");

		do {
			// Counter of divisor quantity
			for (int i = 1; i <= numInit; i++) {
				if (numInit % i == 0) {
					divisorAmount++;
				}
			}

			// Printer of prime number list
			if (numInit > 1 && divisorAmount == 2) {
				System.out.print("" + numInit + " ");
			}

			// Incremental from numInti to numFin
			numInit++;

			// Refresh of divisor quantity for the next loop
			divisorAmount = 0;

		} while (numInit <= numFin);

		sc.close();
	}

}
