package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Please, inform the maximun value that would you do like to calculate the Fibonacci Sequence.");

//		int max = sc.nextInt();

		int number1, number2;
//		int max = 0;
		number1 = 0;
		number2 = 1;
		int max = 0;

		while (max <= 500) {
			System.out.print(" " + number1);
			int number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			max = number1;
		} ;

		sc.close();
	}
}