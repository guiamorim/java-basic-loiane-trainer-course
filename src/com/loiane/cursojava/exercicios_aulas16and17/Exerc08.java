package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 8. This App should receive 5 numbers, also should:
// - identify and return the greater value among them,
// - Sum all values and return it.
// - Calculate and return the average value.

public class Exerc08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double max = 0;
		double sum = 0;
		double number, average;
		int count = 0;

		System.out.println("Enter 5 numbers to evaluate which of them has the greater value.");

		while (count < 5) {
			count++;
			System.out.println("Number: " + count);
			number = sc.nextDouble();

			sum += number;

			if (number > max) {
				max = number;
			}
		}

		average = sum / count;

		System.out.println("The greater number is: " + max);
		System.out.println("The sum of numbers entered is: " + sum);
		System.out.printf("The average of numbers entered is: %.2f", average);
		sc.close();
	}

}
