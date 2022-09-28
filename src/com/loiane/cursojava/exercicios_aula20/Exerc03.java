package com.loiane.cursojava.exercicios_aula20;

import java.util.Random;

public class Exerc03 {

	public static void main(String[] args) {

		int[][] numbers = new int[3][3];
		int evenNumber = 0;
		int oddNumber = 0;

		Random randomNumber = new Random();

		// Matrix populating
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Line " + i + " ");
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = randomNumber.nextInt(9);

				System.out.print(numbers[i][j] + " ");

				//Even/ Odd numbers counter
				if (numbers[i][j] % 2 == 0) {
					evenNumber++;
				} else {
					oddNumber++;
				}

			}

			System.out.println();
		}

		System.out.println("\nResults: ");
		System.out.println("Odd Numbers: " + oddNumber);
		System.out.println("Even Numbers: " + evenNumber);
	}

}
