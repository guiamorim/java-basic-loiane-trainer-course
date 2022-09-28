package com.loiane.cursojava.exercicios_aula20;

import java.util.Random;

// 2 - This app will fill a matrix 10x10 and then will find the minor and major value for a respective column and line.
public class Exerc02 {

	public static void main(String[] args) {

		int[][] randomicNumbers = new int[10][10];

		Random randomNumber = new Random();

		int maxValueLine = 0;
		int minValueLine = 9;

		int maxValueColumn = 0;
		int minValueColumn = 9;

		System.out.println("Random Matrix:");
		
		// Populating matrix
		for (int i = 0; i < randomicNumbers.length; i++) {
			System.out.print("Line " + (i) + ": ");

			for (int j = 0; j < randomicNumbers.length; j++) {
				randomicNumbers[i][j] = randomNumber.nextInt(9);
				System.out.print(randomicNumbers[i][j] + " ");
			}

			System.out.println();
		}

		int columnSelector = randomNumber.nextInt(9);
		int lineSelector = randomNumber.nextInt(9);;

		System.out.println("\nResults:");

		//Processing the minor and major value from random column and line
		for (int i = 0; i < randomicNumbers.length; i++) {

			for (int j = 0; j < randomicNumbers.length; j++) {

				//Picking the min and max value from line
				if (i == lineSelector && minValueLine >= randomicNumbers[i][j]) {
					minValueLine = randomicNumbers[i][j];
				}

				if (i == lineSelector && maxValueLine <= randomicNumbers[i][j]) {
					maxValueLine = randomicNumbers[i][j];
				}

				//Picking the min and max value from column
				if (j == 6 && minValueColumn >= randomicNumbers[i][j]) {
					minValueColumn = randomicNumbers[i][j];
				}

				if (j == 6 && maxValueColumn <= randomicNumbers[i][j]) {
					maxValueColumn = randomicNumbers[i][j];
				}

			}
		}
		System.out.println("Minimun Value of line " + lineSelector + ": " + minValueLine);
		System.out.println("Maximum Value of line " + lineSelector + ": " + maxValueLine);

		System.out.println("Minimum Value of column " + columnSelector + ": " + minValueColumn);
		System.out.println("Maximum Value of column " + columnSelector + ": " + maxValueColumn);
	}

}
