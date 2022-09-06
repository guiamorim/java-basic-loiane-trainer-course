package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

//2. This App stores 10 integers number in array A and then calculates the module results
// of to a second arrayB.

public class Exerc10 {

	public static void main(String[] args) {

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];

		Scanner sc = new Scanner(System.in);

		// array A populate
		System.out.println("Please enter " + arrayA.length + " numbers to fill the array A:");
		int counter = 0;
		while (counter < arrayA.length) {
			System.out.print("Number " + (counter + 1) + ": ");
			arrayA[counter] = sc.nextInt();

			// Handling of value 0 to avoid exception to division bby 0
			while (arrayA[counter] == 0) {
				System.out.println("Value entered is equal to 0. Value is not allowed. Please enter a new value.");
				System.out.print("Number " + (counter + 1) + ": ");
				arrayA[counter] = sc.nextInt();
			}

			counter++;
		}

		// array A show list
		System.out.println("\nArrayA elements: ");
		for (int elem : arrayA) {
			System.out.print(" " + elem);
		}

		// array B populate and show-list
		for (int count2 = 0; count2 < arrayB.length; count2++) {
			arrayB[count2] = arrayA[count2] % 2;
		}
		System.out.println("\n\nArrayB elements: ");

		for (double elem : arrayB) {
			System.out.printf(" %f ", elem);
		}

		sc.close();
	}

}
