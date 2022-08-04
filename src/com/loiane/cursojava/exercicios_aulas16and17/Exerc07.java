package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double max = 0;
		double number;
		int count = 1;

		System.out.println("Enter 5 numbers to evaluate which of them has the greater value.");

		while (count <= 5) {
			System.out.println("Number: " + count);
			number = sc.nextDouble();

			if (number > max) {
				max = number;
			}
			count++;
		}

		System.out.println("THe greater number is: " + max);

		sc.close();
	}

}
