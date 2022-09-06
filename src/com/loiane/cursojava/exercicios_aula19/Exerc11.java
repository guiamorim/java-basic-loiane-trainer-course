package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 11 - This app receives many different numbers. All these numbers are stored in an
// one array Z, then should show only even numbers and output the quantity of them.

public class Exerc11 {

	public static void main(String[] args) {

		double[] arrayZ = new double[10];
		int evenNumberQuantity = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		for (int i = 0; i < arrayZ.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayZ[i] = sc.nextDouble();
		}

		for (double even : arrayZ) {
			if (even % 2 == 0) {
				System.out.print(" " + even);
				evenNumberQuantity++;
			}
		}

		System.out.println("\nEven Numbers quantity: " + evenNumberQuantity);

		sc.close();
	}

}
