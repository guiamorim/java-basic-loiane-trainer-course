package com.loiane.cursojava.exercicios_aula19;

public class Exerc01 {

	public static void main(String[] args) {

		int[] arrayA = new int[5];
		int[] arrayB = new int[5];

		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;
		arrayA[3] = 4;
		arrayA[4] = 10;

		for (int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
			System.out.println("" + arrayA[i] + " is copied to arrayB. ");

		}

		System.out.print("\nContent of Array B: ");

		for (int elem : arrayB) {
			System.out.print(" " + elem);
		}

	}

}
