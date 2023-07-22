package com.loiane.cursojava.aula47;

// Exceptions treatment

public class Exception {

	public static void main(String[] args) {

		try {
			int[] array1 = new int[4];

			System.out.println("Before of exception handling.");

			array1[4] = 1; // This position access wil generate a exception ArrayOutOfBoundException

			System.out.println("This text wont be printed");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exception at a index accessing that doesn't exist.");
		}

		System.out.println("This text will be printed after the exception handling.");
	}

}
