package com.loiane.cursojava.aula34.labs;

public class Calculator {

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtraction(double num1, double num2) {
		return num1 - num2;

	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}

	public static double pow(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static int factorial(int num1) {
		int num = num1;

		int factorial = num;
		System.out.print(num + "! = ");

		
		if(num == 0) {
			return 1;
		} else if(num == 1) {
			return 1;
		}else {
		}
		for (int i = num; i > 1; i--) {

			// display mode
			System.out.print(i - 1);
			
			if (i - 1 == 1) {
				System.out.print(" = ");
			} else {
				System.out.print(" x ");
			}
			factorial *= (i - 1);
		}

		// System.out.println(factorial);
		return factorial;
		}
	}
