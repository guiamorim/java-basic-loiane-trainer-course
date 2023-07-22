package com.loiane.cursojava.aula49;

public class Exceptions {

	public static void main(String[] args) {

		int[] array5 = new int[5];

		array5[0] = 5;
		array5[1] = 10;
		array5[2] = 15;
		array5[3] = 20;
		array5[4] = 25;

		int[] array6 = { 2, 1, 2, 0 };

		System.out.println(array5.length);

		try {

			for (int i = 0; i < array5.length; i++) {
				System.out.println("Array5: " + array5[i] + " and Array6: " + array6[i]);
				System.out.println("Array5 / Array6 = " + array5[i] / array6[i]);
			}

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		} finally {
			System.out.println("Closing the try/Catch or any other process.");
		}

		System.out.println("It will be executed after the error");
	}

}
