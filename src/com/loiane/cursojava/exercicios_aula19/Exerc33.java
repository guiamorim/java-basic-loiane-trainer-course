package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 33 - This app will receives 10 numbers to compose the array and then
// the app will validate which of these numbers can be considered a prime number.

public class Exerc33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[10];

		System.out.println("\nPlease, fill the array... \n");
		
		//Array populating
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}

		System.out.println("\nPrime NUMBER validation... \n");
		
		// Prime number calculation
		int count = 0;
		//int num = 17;

		for (int n : nums) {
			for (int i = 1; i <= n; i++) {
				if (n != 1 && n % i == 0) {
					count++;
				}
				
			}
			System.out.print("    Count: " + count);

			if (count == 2) {
				System.out.println(" - " + n + " is a prime number.");
			} else {
				System.out.println(" - " + n + " is not a prime number.");
			}
			count = 0;
		}

		sc.close();
	}

}
