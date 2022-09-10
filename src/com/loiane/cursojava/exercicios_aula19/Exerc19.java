package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {

		System.out.println("================================================");
		System.out.println("|                GRADE SYSTEM                  |");
		System.out.println("================================================\n");

		System.out.println("Please, enter the first grades.");

		System.out.print("Enter the number of students: ");
		Scanner sc = new Scanner(System.in);

		int studentQuantity = sc.nextInt();

		System.out.println("\nEntering grades...");

		double[] grade1 = new double[studentQuantity];
		double[] grade2 = new double[studentQuantity];
		double[] result = new double[studentQuantity];

		// Filling the first array grade1 for that 10 positions
		for (int i = 0; grade1.length > i; i++) {

			System.out.print("Student " + (i + 1) + ": ");

			grade1[i] = sc.nextDouble();
			// Grade interval validation between 0 and 100 points.
			while (grade1[i] < 0 || grade1[i] > 100) {
				System.out.println("Grade value is not valid. Please enter a value between 0 and 100.");
				System.out.print("Student " + (i + 1) + ": ");
				grade1[i] = sc.nextDouble();
			}
		}

		System.out.println("Please, enter the second grades.");

		// Filling the second array grade2 for that 10 positions
		for (int i = 0; grade2.length > i; i++) {

			System.out.print("Student " + (i + 1) + ": ");
			grade2[i] = sc.nextDouble();
			// Grade interval validation between 0 and 100 points.
			while (grade2[i] < 0 || grade2[i] > 100) {
				System.out.println("Grade value is not valid. Please enter a value between 0 and 100.");
				System.out.print("Student " + (i + 1) + ": ");
				grade2[i] = sc.nextDouble();
			}
		}

		// Populate the Result array with the average value from previous 2 grades
		for (int i = 0; result.length > i; i++) {
			result[i] = (grade1[i] + grade2[i]) / 2;
		}

		// Result output (grade value and result)

		System.out.println("\n================================================");
		System.out.println("|                   RESULTS                    |");
		System.out.println("================================================\n");
		System.out.println("STUDENT   GRADE FINAL RESULT \n");

		for (int i = 0; result.length > i; i++) {
			if (result[i] >= 70) {
				System.out.println("Student " + (i + 1) + " - " + result[i] + "; APROVED");
			} else {
				System.out.println("Student " + (i + 1) + " - " + result[i] + "; NOT APROVED");
			}
		}

		sc.close();
	}

}
