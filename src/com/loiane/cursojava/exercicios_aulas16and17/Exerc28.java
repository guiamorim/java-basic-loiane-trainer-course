package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter a positive number to validate if it's a prime number.");
		int num = sc.nextInt();
		int divisorsAmount = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisorsAmount++;
			}
		}

		if (num > 1 && divisorsAmount == 2) {
			System.out.print("The number " + num + " is a prime number.");
		} else if (num < 0) {
			System.out.println("This is a negative number, please enter a positive number.");
		} else {
			System.out.print("The number " + num + " is not a prime number.");
		}
		sc.close();
	}

}
