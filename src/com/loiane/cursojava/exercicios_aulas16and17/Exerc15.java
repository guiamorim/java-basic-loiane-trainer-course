package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

//15. THis App will calculate and present the Fibonacci Serie.

public class Exerc15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, inform how many times would you like to calculate the Fibonacci Sequence.");

		int count = sc.nextInt();

		int number1, number2;

		number1 = 0;
		number2 = 1;

		for (int i = 0; i <= count; i++) {
			System.out.print(" " + number1);
			int number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
		}

		sc.close();
	}

}
