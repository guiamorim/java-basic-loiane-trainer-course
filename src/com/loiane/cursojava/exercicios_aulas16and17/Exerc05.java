package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 5. This App Will evaluate how long time in years the population of city A
// is equal or greater than population of city B.
// Also, after evaluation will present the analysis and ask if user wants to 
// do another analysis validating the user input.

public class Exerc05 {

	public static void main(String[] args) {

		double populationA, populationB, growthRateA, growthRateB;
		int year = 0;
		char answer = 'n';

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter positives values.");

			System.out.println("Please enter the population for city A:");
			populationA = sc.nextDouble();

			System.out.println("Please enter the population growthing rate for city A (%): ");
			growthRateA = sc.nextDouble() / 100;

			System.out.println("Please enter the population for city B:");
			populationB = sc.nextDouble();
			System.out.println("Please enter the population growthing rate for city B (%): ");
			growthRateB = sc.nextDouble() / 100;

//		populationA = 80_000;
//		growthRateA = 0.03;
//		
//		populationB = 200_000;
//		growthRateB = 0.015;

			do {
				year++;

				populationA *= (growthRateA + 1);

				populationB *= (growthRateB + 1);

				if (populationA == populationB) {
					System.out.println("\nYear: " + year);
					System.out.println("population A is equal to population B at year:" + year);
					System.out.printf("Population A: %.2f %n", populationA);
					System.out.printf("Population B: %.2f %n", populationB);
				} else if (populationA > populationB) {
					System.out.println("\nYear: " + year);
					System.out.println("Population A is over population B at year:" + year);
					System.out.printf("Population A: %.2f %n", populationA);
					System.out.printf("Population B: %.2f %n", populationB);
				} else {

				}

			} while (populationA != populationB && populationA < populationB);

			do {
				System.out.println("Do you want to re-run the script? (y/n)");
				answer = sc.next().strip().toLowerCase().charAt(0);

				if (answer == 'n') {

					System.out.println("Thank you for your prefference.");
				} else if (answer != 'n' && answer != 'y') {
					System.out.println("Invalid input. Try y: yes or n: no .");
				} else {
					answer = 'y';
				}
				;
			} while (answer != 'y' && answer != 'n');

		} while (answer == 'y');
		sc.close();
	}

}
