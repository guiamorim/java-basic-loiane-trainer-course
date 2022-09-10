package com.loiane.cursojava.exercicios_aula19;

//26 - This app will fill ramdonly all positions into first array and the second one
//then based on rules will fill with 0, 1 or -1 the third array. At the end will list the result.


public class Exerc26 {
	
	public static void main(String[] args) {

		int[] arrayD = new int[10];
		int[] arrayE = new int[10];
		int[] arrayF = new int[10];

		System.out.println("Filling the array content...\n");

		System.out.println("Array D:");
		// Populate the array D
		for (int i = 0; i < arrayD.length; i++) {
			arrayD[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayD[i]);
		}

		System.out.println("\nArray E:");
		// Populate the array E
		for (int i = 0; i < arrayE.length; i++) {
			arrayE[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayE[i]);
		}

		// Populate the arrayF based on rules.
		for (int i = 0; i < arrayF.length; i++) {
			if (arrayD[i] > arrayE[i]) {
				arrayF[i] = 1;
			} else if (arrayD[i] == arrayE[i]) {
				arrayF[i] = 0;
			} else {
				arrayF[i] = -1;
			}
		}

		// List array F
		System.out.println("\nArray F:");

		for (int f : arrayF) {
			System.out.print("" + f + " ");
		}
	}

}
