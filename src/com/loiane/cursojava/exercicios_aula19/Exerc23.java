package com.loiane.cursojava.exercicios_aula19;

// 23 - This app will generate ramdonly 10 numbers and then will list all of them until
// identify the first odd number.

public class Exerc23 {

	public static void main(String[] args) {

		int[] arrayN = new int[10];

		System.out.println("Filling the array content...");

		// Populate the array N
		for (int i = 0; i < arrayN.length; i++) {
			arrayN[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayN[i]);
		}

		// List and identify the odd number
		for (int n : arrayN) {

			System.out.print("Number: " + n);
			if (n % 2 != 0) {
				System.out.print(" <- This number is not even.");
				break;
			}
			System.out.println("");

		}

	}

}
