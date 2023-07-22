package com.loiane.cursojava.aula48;

public class MultiplesCatchGeneric {

	public static void main(String[] args) {

		int[] array3 = { 0, 3, 6, 9, 12 };

		int[] array4 = { 0, 1, 2, 3};

		for (int i = 0; i < array3.length; i++) {

			try {
				System.out.println("Array3: " + array3[i] + " and Array4: " + array4[i]);
				System.out.println("Result: " + array3[i] + " + " + array4[i] + " = " + array3[i] / array4[i]);
			} catch (Throwable exception) {
				exception.printStackTrace();
			}
		}
	}

}
