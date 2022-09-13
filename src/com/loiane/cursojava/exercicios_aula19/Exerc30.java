package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 30 - This app will receives x elements and then will 'll process it fift/fift
// for other 2 arrays with the half size of frist array. One array only will
// receives even numbers and other will receive odd numbers.

public class Exerc30 {

	public static void main(String[] args) {

		int[] arrayA = new int[10];
		int[] arrayB = new int[5];
		int[] arrayC = new int[5];

		Scanner sc = new Scanner(System.in);

		// Populate the array A
		System.out.println("\nArray A elements:\n");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("" + (i + 1) + " - ");
			arrayA[i] = sc.nextInt();
		}
		
		//counters for sub for
		int count = 0;


		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % 2 == 0) {
				for (int j = count; j < arrayB.length; j++) {
					arrayB[j] = arrayA[i];
				}
				count++;
			}

			if (arrayA[i] % 2 != 0) {
				for (int j = count; j < arrayC.length; j++) {
					arrayC[j] = arrayA[i];
				}

			}
		}

		System.out.println("\nArray B elements:");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.printf("%d position: %s%n", (i + 1), arrayB[i]);

		}

		System.out.println("\nArray C elements:");
		for (int i = 0; i < arrayC.length; i++) {
			System.out.printf("%d position: %s%n", (i + 1), arrayC[i]);

		}
		sc.close();
	}

}
