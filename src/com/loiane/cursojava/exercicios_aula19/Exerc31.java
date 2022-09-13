package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;
// 31 - This app should receives 10 numbers been half of them even and ohter half
// odd number. Then it will be replicated to arrayY, been the first half for even numbers and 
// the other half, only for odd numbers.


public class Exerc31 {

	public static void main(String[] args) {

		int[] arrayW = new int[10];
		int[] arrayY = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayW.length; i++) {
			System.out.printf("Position %d: ", i + 1);
			arrayW[i] = sc.nextInt();
		}

		// counters for sub for
		int count = 0;
//		int count2 = 0;

		for (int i = 0; i < arrayY.length; i++) {
			if (arrayW[i] % 2 == 0) {
				arrayY[count] = arrayW[i];
				count++;
			} else {
				arrayY[arrayY.length - (count + 1)] = arrayW[i];

			}
		}

		for (int y : arrayY) {
			System.out.println("Position:" + y);
		}

		sc.close();

	}

}
