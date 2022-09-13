package com.loiane.cursojava.exercicios_aula19;

// 29 - This app will creates 2 automatic filled arrays with 10 positions.
// Then the arrayC will reiceves all elements, at total of 20, first 10 elements
// received from arrayA e last 10 elements from arrayB.

public class Exerc29 {

	public static void main(String[] args) {

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[20];

		// Populate the array A
		System.out.println("\nArray A elements:\n");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayA[i]);
		}

		// Populate the array B
		System.out.println("\nArray B elements:\n");
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayB[i]);
		}

		// Populate the array C
		System.out.println("\nArray C elements:\n");
		for (int i = 0; i < arrayC.length; i++) {
			if (i < 10) {
				arrayC[i] = arrayA[i];
			}

			if (i >= 10) {
				arrayC[i] = arrayB[i - arrayB.length];
			}

			System.out.println("" + (i + 1) + " - " + arrayC[i]);

		}
	}

}
