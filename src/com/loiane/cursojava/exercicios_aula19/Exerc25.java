package com.loiane.cursojava.exercicios_aula19;

// 25 - This app will fill ramdonly all positions into first array and 
// then based on rules will fill with 0 or 1 the second array. At the end will list the result.

public class Exerc25 {

	public static void main(String[] args) {

		int[] arrayM = new int[10];
		int[] arrayO = new int[10];

		System.out.println("Filling the array content...\n");
		
		System.out.println("Array M:");
		// Populate the array N
		for (int i = 0; i < arrayM.length; i++) {
			arrayM[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayM[i]);
		}

		// Populate the array O based on rules.
		for (int i = 0; i < arrayO.length; i++) {
			if (arrayM[i] % 2 == 0) {
				arrayO[i] = 1;
			} else {
				arrayO[i] = 0;
			}
		}

		System.out.println("\nArray O:");
		// List array O
		for (int o : arrayO) {
			System.out.print("" + o + " ");
		}
	}

}
