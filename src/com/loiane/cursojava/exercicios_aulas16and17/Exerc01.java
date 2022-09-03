package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 1. This App will reads 2 grade values that must be between 0 and 10.
// if not the App will request it again until both values be accepted.
// Also will indicate which numbers are wrong or out of expected scope.

public class Exerc01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		num1 = 0;
		num2 = 0;
		boolean askAgain = true;

		while (askAgain) {// !(num1 >= 0 && num1 <= 10) && !(num2 >= 0 && num2 <= 10)){
			System.out.println("\nPlease enter two integer numbers between 0 and 10");

			System.out.println("#1 number:");
			num1 = sc.nextInt();
			System.out.println("#2 number:");
			num2 = sc.nextInt();

			System.out.println("\nNumber #1: " + num1);
			System.out.println("NUmber #2: " + num2);

			if ((num1 >= 0 && num1 <= 10) && (num2 >= 0 && num2 <= 10)) {
				System.out.println("\nNumbers are valid, thank you!");
				askAgain = false;

			} else {
				System.out.println("\nWe sorry, numbers are not valid.\n");
				if ((num1 < 0 || num1 > 10) && (num2 < 0 || num2 > 10)) {
					System.out.println(num1 + " and " + num2 + " are out from accepted range.");
				} else if (num1 <= 0 || num1 >= 10) {
					System.out.println(num1 + " is out from accepted range.");
				} else {
					System.out.println(num2 + " is out from accepted range.");
				}
			}
		}

		sc.close();
	}

}
