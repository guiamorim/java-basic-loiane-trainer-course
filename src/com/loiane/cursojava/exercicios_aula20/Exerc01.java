package com.loiane.cursojava.exercicios_aula20;

import java.util.Random;

public class Exerc01 {

	public static void main(String[] args) {

		int[][] values = new int[4][4];
		int maxNumber = Short.MIN_VALUE;
		int line = 0;
		int col = 0;

		Random randomNumber = new Random();

		
		for (int i = 0; i < values.length; i++) {
			System.out.print("L[" + i+ "]: ");
			for (int j = 0; j < values[i].length; j++) {
				values[i][j] = randomNumber.nextInt(100);
				System.out.print(values[i][j] + " ");

				if (maxNumber < values[i][j]) {
					maxNumber = values[i][j];
					line = i;
					col = j;
				}
			}
			System.out.println();

		}

		System.out.println("\nMax Number: " + maxNumber);
		System.out.println("Line: " + line);
		System.out.println("Column: " + col);
		
	}

}
