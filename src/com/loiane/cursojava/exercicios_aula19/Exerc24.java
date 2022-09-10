package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 24 - This app will ask for the array size to build it. Then will populate the array, 
// then will validate if a number a palindrome number or not.
// Palindrome number ex.: 121, 1331, 4567654, 123454321, 1234554321 ...

public class Exerc24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("===== PALINDROME NUMBER VALIDATOIN =======");
		System.out.println("==========================================\n");

		boolean again = true;

		while (again) {
			System.out.print("Please enter the array size: ");
			int arraySize = sc.nextInt();

			int[] arrayP = new int[arraySize];

			System.out.println("\nEnter a number between 0 and 10 for each position: ");
			// Populate Array P
			for (int i = 0; i < arrayP.length; i++) {
				System.out.print("Number " + (i + 1) + ": ");
				arrayP[i] = sc.nextInt();
			}

			System.out.print("\nNumber: ");

			for (int p : arrayP) {
				System.out.print(p);
			}

			System.out.println();

			boolean isPalindrome = true;

			// Palindrome validation
			for (int i = 0; i < arrayP.length; i++) {
				if (arrayP[i] != arrayP[arrayP.length - (i + 1)]) {
					isPalindrome = false;
				}
			}

			System.out.println("\n-----------------------------------------");
			System.out.println("                RESULTS                  ");
			System.out.println("-----------------------------------------\n");
			// Result output
			if (isPalindrome) {
				System.out.println("The number represented by the number set in arrayP is a palindrome.");
			} else {
				System.out.println("The number represented by the number set in arrayP is not a palindrome.");
			}
			
			System.out.println("Do you wish to continue validating other number? [Y/N]");
			String response = sc.next().strip().toUpperCase();
			
			if(response == "n") {
				again = false;
			}
		}
		sc.close();
	}

}
