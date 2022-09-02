package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;
// 31 . This app will calculates the increse of salary from hiring date until the current year.

public class Exerc31 {

	public static void main(String[] args) {

		double salary = 1000;
		double salaryRaiseRate = 0.15;
		int year;
		int currentYear = 2022;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please inform the hiring year: ");

		year = sc.nextInt();

		while (year <= currentYear) {

			if (year < 1997) {
				salary *= (1 + salaryRaiseRate);
				System.out.printf("Ano %d -> %.2f. Increase of %.2f%n", year, salary, salaryRaiseRate);
				year++;
			}

			if (year >= 1997) {
				salaryRaiseRate *= 2;

				salary *= (1 + salaryRaiseRate);
				System.out.printf("Ano %d -> %.2f. Increase of %.2f%n", year, salary, salaryRaiseRate);
				year++;
			}

		}
		sc.close();
	}
}