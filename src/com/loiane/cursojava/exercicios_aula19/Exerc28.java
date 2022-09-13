package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 28 - This App will receives 6 elements and replicate the same elements into 
// other array in reverse mode.

public class Exerc28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arrayR = new String[6];
		String[] arrayS = new String[6];
		
		// populate arrayR
		System.out.println("Array R elements:");
		for (int i = 0; i < arrayR.length; i++) {
			System.out.printf("%d position: ", (i + 1));
			arrayR[i] = sc.next();
		}

		// populate arrayS
		System.out.println("\nArray S elements:");
		for (int i = 0; i < arrayS.length; i++) {
			arrayS[i] = arrayR[(arrayR.length - (i + 1))];
			System.out.printf("%d position: %s%n", (i + 1), arrayS[i]);
		}

		sc.close();
	}

}
