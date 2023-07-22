package com.loiane.cursojava.aula52;

// USing my own Exception

public class PersonalException {

	public static void main(String[] args) {

		int[] numb = { 4, 8, 5, 32, 64, 128, 129 };

		int[] denom = { 2, 0, 4, 6, 11, 10 };

		// System.out.println(array5.length);

		for (int i = 0; i < numb.length; i++) {

			try {
				if (numb[i] % 2 != 0) {
					// launch personalized exception
					throw new NotExactDivision(numb[i], denom[i]);
				}
				System.out.println("Numerator[" + i + "]: " + numb[i] + "\nDenominator[" + i + "]: " + denom[i]);
				System.out.println(numb[i] + "/" + denom[i] + " = " + numb[i] / denom[i]);
				System.out.println("");
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NotExactDivision exception) {
				System.out.println("Exception found.");
				exception.printStackTrace();
				System.out.println();
			} 

			// System.out.println("It will be executed.\n");
		}
	}

}
