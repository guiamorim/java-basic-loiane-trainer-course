package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 15 - This app should receives 10 integers numbers and then will process the percentage
// from these numbers about even and odd numbers from a total of elements.

public class Exerc15 {

	public static void main(String[] args) {

		int[] arrayY = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter a number");

		for (int i = 0; i < arrayY.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayY[i] = sc.nextInt();
		}

		int evenElementsQuantity = 0;
		int oddElementsQuantity = 0;

		for (int elem : arrayY) {

			if (elem % 2 == 0) {
				evenElementsQuantity++;
			} else {
				oddElementsQuantity++;
			}
		}

//		System.out.println(arrayY.length);
//		System.out.println("Odd: " + oddElementsQuantity);
//		System.out.println("Even: " + evenElementsQuantity);
		
		double oddElementsPercentage = ((oddElementsQuantity * 100) / arrayY.length);
		double evenElementsPercentage = ((evenElementsQuantity * 100) / arrayY.length);

		System.out.println("\nOdd elements percentage: " + oddElementsPercentage + "%");
		System.out.println("\nEven elements percentage: " + evenElementsPercentage + "%");

		sc.close();
	}

}
