package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 10. This App should reads the gross salary and calculate the properly salary adjustment as per the range.
// Also shows some additional details

public class Exerc10 {

	public static void main(String[] args) {

		double oldSalary, salary, adjustmentPercentage, adjustment;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter the amount of gross salary:");
		salary = sc.nextDouble();

		System.out.println("Please, find the below processing of your Salary");

		if (salary <= 2800) {
			oldSalary = salary;
			salary *= 1.20; // 20%
			adjustmentPercentage = 20;
			adjustment = salary - oldSalary;
		} else if (salary >= 2800 && salary < 7000) {
			oldSalary = salary;
			salary *= 1.15;
			adjustmentPercentage = 15;
			adjustment = salary - oldSalary;
		} else if (salary >= 7000 && salary < 15000) {
			oldSalary = salary;
			salary *= 1.10;
			adjustmentPercentage = 10;
			adjustment = salary - oldSalary;
		} else {
			oldSalary = salary;
			salary *= 1.05;
			adjustmentPercentage = 5;
			adjustment = salary - oldSalary;
		}

		System.out.println("Salary before adjustment:" + oldSalary);
		System.out.println("Salary after adjustment:" + salary);
		System.out.println("Applied adjustment %:" + adjustmentPercentage);
		System.out.println("Applied adjustment value:" + adjustment);
		
		sc.close();
	}
}
