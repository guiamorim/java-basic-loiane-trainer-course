package com.loiane.cursojava.aula48;

public class MutiplesCatch {

	public static void main(String[] args) {

		int[] array = { 4, 8, 16, 32, 64, 128 };
		int[] array2 = new int[5];
		array2[0] = 2;
		array2[1] = 0;
		array2[2] = 4;
		array2[3] = 8;
		array2[4] = 0;

		for (int i = 0; i < array.length; i++) {
			try {
				System.out.println("Array: " + array[i] + " e Array2: " + array2[i]);
				System.out.println("Outcome: " + array[i] + "/" + array2[i] + " = " + array[i] / array2[i]);
				System.out.println("");
			} catch (ArithmeticException exception) {
				System.out.println("EXCEPTION: Error at division by zero.");
				System.out.println("");
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("EXCEPTION: Array position is invalid.");
				System.out.println("");
			}

		}

	}

}
