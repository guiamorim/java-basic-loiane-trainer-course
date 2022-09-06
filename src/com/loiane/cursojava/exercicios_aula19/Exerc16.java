package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 16 - This app will receives 10 integer numbers and than the app will process:
// total sum of numbers with value lower than 15, also the total sum of elements equal to 15
// and finally will output the average value of elements with value above of 15.

public class Exerc16 {

	public static void main(String[] args) {

		int[] arrayY = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter " + arrayY.length + " number(s).");

		for (int i = 0; i < arrayY.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayY[i] = sc.nextInt();
		}

		int lowerThan15Quantity = 0;
		int equalTo15Quantity = 0;
		int greaterThan15Quantity = 0;
		int sumGreaterThan15 = 0;

		for (int elem : arrayY) {

			if (elem == 15) {
				equalTo15Quantity += elem;
			} else if (elem < 15) {
				lowerThan15Quantity += elem;
			} else {
				greaterThan15Quantity++;
				sumGreaterThan15 += elem;
			}
		}

		double averageGreaterThan15 = sumGreaterThan15 / greaterThan15Quantity;

		System.out.println("\n - Sum of elements with value below of 15: " + lowerThan15Quantity);
		System.out.println(" - Sum of elements with value equal to 15: " + equalTo15Quantity);
		System.out.println(" - Sum of elements with value above of to 15: " + sumGreaterThan15);
		System.out.println(" - Number of elements with value above of 15: " + greaterThan15Quantity);
		System.out.println(" - Average of elements with value above of 15: " + averageGreaterThan15);

		sc.close();

	}

}
