package com.loiane.cursojava.aula33;

// This class is to train the overload of methods. 
// A method may be overloaded when we use the method signature (same method name, and different parameters)

public class MyCalculator {

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public int sum(int[] numbers) {

		int total = 0;

		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}

		return total;
	}
}
