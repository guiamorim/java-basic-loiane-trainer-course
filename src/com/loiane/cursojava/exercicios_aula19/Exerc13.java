package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 13 - This app will request 10 numbers, soter them into an array of integers and then
//outputs the sum of each one of these array elements that is multiple of 5.

public class Exerc13 {

	public static void main(String[] args) {

		int[] arrayY = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter a number");

		for (int i = 0; i < arrayY.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arrayY[i] = sc.nextInt();
		}

		int sumMultipleOf5 = 0;
		for (int elem : arrayY) {
			if (elem % 5 == 0) {
				sumMultipleOf5 += elem;
			}
		}

		System.out.println("\nSum of array elements multiples of 5: " + sumMultipleOf5);

		sc.close();

	}

}
