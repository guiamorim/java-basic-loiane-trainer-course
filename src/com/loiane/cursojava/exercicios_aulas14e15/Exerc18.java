package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 19. This App evaluate is a number is odds or evens and infomr user about it.

public class Exerc18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double number;

		System.out.println("Please enter a number to evaluate if its odds or evens.");

		number = sc.nextDouble();

		if (number % 2 == 0) {
			System.out.println("This number is even.");
		} else {
			System.out.println("This number is odd.");
		}
		sc.close();
	}

}
