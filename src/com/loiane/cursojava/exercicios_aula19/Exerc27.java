package com.loiane.cursojava.exercicios_aula19;

//26 - This app will fill ramdonly all positions into first array and
//then based on rules will fill with chars the third array. 
// At the end will list the result.


public class Exerc27 {
	
	public static void main(String[] args) {

		int[] arrayG = new int[10];
		char[] arrayH = new char[10];

		System.out.println("Filling the array content...\n");

		System.out.println("Array G:");
		// Populate the array D
		for (int i = 0; i < arrayG.length; i++) {
			arrayG[i] = (int) Math.round(Math.random() * 10);
			System.out.println("" + (i + 1) + " - " + arrayG[i]);
		}


		// Populate the arrayF based on rules.
		for (int i = 0; i < arrayH.length; i++) {
			if (arrayG[i] < 7) {
				arrayH[i] = 'a';
			} else if (arrayG[i] == 7) {
				arrayH[i] = 'b';
			} else if (arrayG[i] > 7 && arrayG[i] < 10) {
				arrayH[i] = 'c';
			} else if (arrayG[i] == 10) {
				arrayH[i] = 'd';
			} else {
				arrayH[i] = 'e';
			}
		}

		// List the char array F
		System.out.println("\nArray F:");

		for (char h : arrayH) {
			System.out.print("" + h + " ");
		}
	}

}

