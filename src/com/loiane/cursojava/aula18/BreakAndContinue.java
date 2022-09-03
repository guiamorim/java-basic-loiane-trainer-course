package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter the first number of sequence: ");
		int initNumber = sc.nextInt();

		System.out.print("Please, enter the last number of sequence: ");
		int maxNumber = sc.nextInt();

		System.out.print("Please, enter the divisor value: ");
		int divisor = sc.nextInt();

		System.out.print("Please, enter the desirable position of your choose: ");
		int position = sc.nextInt();

		int divisibleNumberQuantity = 0;

		if (divisor > maxNumber) {
			System.out.println("\nDivisor value greather than maximum Number value!\nPlease, try again.");
		} else {

			System.out.println("\nSearching by divisible number...\n");

			System.out.println("Initial number: " + initNumber);
			System.out.println("Maximum number: " + maxNumber);
			System.out.println("Divisor value:" + divisor);
			System.out.println("Position expected: " + position);

			for (int i = initNumber; i <= maxNumber; i++) {

				// gathering the quantity of divisible numbers
				if (i % divisor == 0) {
					divisibleNumberQuantity++;
				}

				// show the correct divisable number based on position previusly informed
				if (position == divisibleNumberQuantity) {
					System.out.println("[" + i + "] -> This is your " + position + "° divisible number by 9.");
					break; // after find the desirable position jump out of for
				}
				
				//Uncomment it if want to show the sequence of number from initial number until the found position.
				//System.out.println(i); 
			}

		}
		sc.close();
		
		
	}

}
