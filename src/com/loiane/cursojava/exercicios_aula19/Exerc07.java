package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

//2. This App stores 10 integers number in 2 array each and then replicate the subtraction
//between of them to a third arrayC.

public class Exerc07 {

	public static void main(String[] args) {

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[10];

		Scanner sc = new Scanner(System.in);

		// array A populate
		System.out.println("Please enter " + arrayA.length + " numbers to fill the array A:");
		int counter = 0;
		while (counter < arrayA.length) {
			System.out.print("Number " + (counter + 1) + ": ");
			arrayA[counter] = sc.nextInt();
			counter++;
		}

		// array A populate
		System.out.println("\n\nPlease enter " + arrayB.length + " numbers to fill the array B:");
		counter = 0;
		while (counter < arrayB.length) {
			System.out.print("Number " + (counter + 1) + ": ");
			arrayB[counter] = sc.nextInt();
			counter++;
		}

		// array A show list
		System.out.println("\nArrayA elements: ");
		for (int elem : arrayA) {
			System.out.print(" " + elem);
		}

		// array B show list
		System.out.println("\n\nArrayB elements: ");
		for (int elem : arrayB) {
			System.out.print(" " + elem);
		}

		// array C populate and show list
		for (int count2 = 0; count2 < arrayC.length; count2++) {
			arrayC[count2] = arrayA[count2] - arrayB[count2];
		}
		System.out.println("\n\nArrayC elements: ");

		for (int elem : arrayC) {
			System.out.print(" " + elem);
		}

		sc.close();
	}

}

