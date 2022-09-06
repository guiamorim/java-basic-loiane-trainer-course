package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 2. This App stores 8 integers number and replicate
// the double of them for a second  array.

public class Exerc02 {

	public static void main(String[] args) {

		int[] arrayA = new int[8];
		int[] arrayB = new int[8];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 8 numbers to fill the array A:");
		int counter = 0;
		while (counter < arrayA.length) {
			System.out.print("Number " + (counter + 1) + ": ");
			arrayA[counter] = sc.nextInt();
			counter++;
		}

		System.out.println("\nArrayA elements: ");
		for (int elem : arrayA) {
			System.out.print(" " + elem);
		}

		for (int count2 = 0; count2 < arrayA.length; count2++) {
			arrayB[count2] = 2 * arrayA[count2];
		}
		System.out.println("\n\nArrayB elements: ");

		for (int elem : arrayB) {
			System.out.print(" " + elem);
		}

		sc.close();
	}

}
