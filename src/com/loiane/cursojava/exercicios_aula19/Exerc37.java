package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// This app will receives 15 elements to serve as base to array composition, but before
// of 
public class Exerc37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[15];
		int[] factorials = new int[15];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}

		System.out.println("Factorial values calculation...");

		// Array factorials populating
		for (int i = 0; i < factorials.length; ) {

			// picking all elements from array nums to calculate the factorial value
			for (int n : nums) {

				// Factorial rule
				// System.out.print("" + n + "! = ");
				for (int j = n; j > 1; j--) {
					n = n * (j - 1);
				}
				// System.out.println(n);
				factorials[i] = n;
				i++;
			}

		}

		// Array facrtorials listing
		int count = 0;
		for (int f : factorials) {
			System.out.println("Number " + (count + 1) + ": " + f);

			count++;
		}
		sc.close();
	}

}
