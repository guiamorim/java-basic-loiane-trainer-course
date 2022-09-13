package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 34 - This app should receives 10 numbers to fill the array,
// and then will create a list for each array element and will print only even number
// until the current value of element.

public class Exerc34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[10];

		System.out.println("\nPlease, fill the array... \n");

		// Array populating
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}

		System.out.println("\nEven  NUMBER validation... \n");

		// Prime number calculation

		for (int n : nums) {
			System.out.print(" " + n + ": ");

			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					System.out.print(" " + i);
				}

			}
			System.out.println("");
		}
		sc.close();

	}

}
