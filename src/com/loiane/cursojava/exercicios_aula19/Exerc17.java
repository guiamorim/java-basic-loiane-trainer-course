package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {

		int[] arrayY = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter " + arrayY.length + " values for years old.");

		for (int i = 0; i < arrayY.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayY[i] = sc.nextInt();
		}

		int ageOver35 = 0;

		for (int elem : arrayY) {

			if (elem > 35) {
				ageOver35++;
			}
		}

		System.out.println("\n - Total of people that are years old over 35 years: " + ageOver35);

		sc.close();
	}

}
