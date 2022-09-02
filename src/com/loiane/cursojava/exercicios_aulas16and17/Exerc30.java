package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please inform the number to calculation:");
		int num = sc.nextInt();

		System.out.println("Showing calculation table of: " + num);

		System.out.print("Starts on:");
		int initialDivisor = sc.nextInt();

		System.out.print("Ends on: ");
		int finalDivisor = sc.nextInt();

		if (initialDivisor > finalDivisor) {
			System.out.println("initial divisor is smaller than final divisor.");
		} else {

			System.out.println("==============================================================");
			System.out.println(
					"Building the calculation table from " + initialDivisor + " and ending on  " + finalDivisor + ":");

			System.out.println("==============================================================");

			do {
				System.out.println("" + num + "x" + initialDivisor + " = " + (num * initialDivisor));

				initialDivisor++;
			} while (initialDivisor <= finalDivisor);
		}
		sc.close();
	}

}
