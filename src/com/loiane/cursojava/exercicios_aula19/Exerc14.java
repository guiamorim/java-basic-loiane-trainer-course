package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {

		int[] arrayY = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter a number");

		for (int i = 0; i < arrayY.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayY[i] = sc.nextInt();
		}

		int oddElementsSum = 0;
		int oddElementsQuantity = 0;

		for (int elem : arrayY) {
			if (elem % 2 != 0) {
				oddElementsSum += elem;
				oddElementsQuantity++;
			}
		}

		// System.out.println(oddElementsSum + " " + oddElementsQuantity );
		System.out.println("\nArithmetic average value is: " + oddElementsSum / oddElementsQuantity);

		sc.close();

	}

}
