package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 32 - This app shiuld receives 5 elements for array nums and then calculate 
// the Math table for each one of then.

public class Exerc32 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		Scanner sc = new Scanner(System.in);

		// Populate array

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}

		// Math table calculation

		for (int n : nums) {

			System.out.println("\nMath table for " + n + ": ");
			for (int i = 0; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", n, i, n * i);
			}
		}

		sc.close();
	}

}
