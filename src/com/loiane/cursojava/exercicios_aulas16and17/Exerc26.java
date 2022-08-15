package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 26. This app will calculate a factorial of a number.

public class Exerc26 {

	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		if (num < 0) {
			System.out.println("Sorry, factorial doesn't exist for negative numbers.");
		} else if (num == 0) {
			System.out.println("The factorial of 0 is 1.");
		} else {
			int factorial = 1;
			int i = num;
			System.out.println("Factorial of :" + num);

			System.out.print("" + num + "! = ");
			while (i != 0) {
				System.out.print("" + i + " . ");
				factorial *= i;
				i--;
			}
			System.out.println("=" + factorial);
		}

		sc.close();
	}

}
