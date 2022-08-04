package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// §9. This App will should ask to user how many grade should be calculated and then inform the quantity of grade processed and the average value for that/those grades.

public class Exerc19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please inform how many grade you want to input");

		int gradeQuantity = sc.nextInt();
		double gradeTotal = 0.0;

		for (int i = 1; i <= gradeQuantity; i++) {
			double temp = sc.nextDouble();
			gradeTotal += temp;
		}

		double gradeAverage = gradeTotal / gradeQuantity;

		System.out.println("\n| Results |\n");
		System.out.printf("For those %d grades, the sum is %.2f and the average is: %.2f", gradeQuantity, gradeTotal, gradeAverage);
		sc.close();
	}

}
