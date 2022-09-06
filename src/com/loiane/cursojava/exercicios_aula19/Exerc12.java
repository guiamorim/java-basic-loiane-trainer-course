package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 12 - This App will receive 10 integer number and store them into an array.
// At the end it should output the total of sum of array elements.

public class Exerc12 {

	public static void main(String[] args) {

		int[] arrayX = new int[10];
		int elementSum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		for (int i = 0; i < arrayX.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayX[i] = sc.nextInt();
		}

		for (int elem : arrayX) {
			elementSum += elem;
		}

		System.out.println("\nSum of array elements: " + elementSum);

		sc.close();
		
	}

}
