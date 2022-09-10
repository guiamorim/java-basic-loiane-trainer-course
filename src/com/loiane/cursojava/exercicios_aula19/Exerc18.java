package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 18 - This App will receives 10 values and store them into an array
// and then will process the min and maximum values from that array.

public class Exerc18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arrayW = new int[10];

		System.out.println("Please, enter " + arrayW.length + " ages:");

		for (int i = 0; i < arrayW.length; i++) {
			System.out.print("Age " + (i + 1) + ":");
			arrayW[i] = sc.nextInt();
		}

		// populating the first value to min and maximum age variables
		int minAge = arrayW[0];
		int maxAge = arrayW[0];

		// find the min and max value after iterate the array positions.
		for (int elem : arrayW) {

			if (elem <= minAge) {
				minAge = elem;
			}

			if (elem >= maxAge) {
				maxAge = elem;
			}
		}

		// output of min and max values
		System.out.println("Minimum Age: " + minAge);

		System.out.println("Maximum Age: " + maxAge);

		sc.close();
	}

}
