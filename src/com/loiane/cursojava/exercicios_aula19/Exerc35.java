package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 34 - This app should receives 10 numbers to fill the array,
// and then will create a list of divisors for each array element and will print the number sequence
// until the current value of element.

public class Exerc35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[10];

		System.out.println("\nPlease, fill the array... \n");

		// Array populating
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}

		System.out.println("\nDivisors NUMBER list validation... \n");

		// Prime number calculation

		for (int n : nums) {
			System.out.print(" " + n + ": ");

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(" " + i);
				}

			}
			System.out.println("");
		}
		sc.close();

	}

}
