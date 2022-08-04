package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hourValue, workedHours, grossSalary, netSalary, irsTax, socialSecurityTax, sindicateContribution, totalDiscount;
		
		System.out.println("Please inform the hour value: ");
		
		hourValue = sc.nextDouble();
		
		System.out.println("Please inform the total amount of worked hours");
		
		workedHours = sc.nextDouble();
		
		sindicateContribution = 0;
		socialSecurityTax = 0.0;
		irsTax = 0;
		totalDiscount = 0;
		netSalary = 0;
		grossSalary = hourValue * workedHours;
		
		if (grossSalary <= 900) {
			irsTax = grossSalary * 0.00;
			socialSecurityTax = grossSalary * 0.11;
			sindicateContribution = grossSalary * 0.03;
			totalDiscount = irsTax + sindicateContribution;
			netSalary = grossSalary - totalDiscount;
		} else if (grossSalary > 900 && grossSalary <= 1500) {
			irsTax = grossSalary * 0.05;
			socialSecurityTax = grossSalary * 0.11;
			sindicateContribution = grossSalary * 0.03;
			totalDiscount = irsTax + sindicateContribution;
			netSalary = grossSalary - totalDiscount;
		} else if (grossSalary > 1500 && grossSalary <= 2500 ) {
			irsTax = grossSalary * 0.10;
			socialSecurityTax = grossSalary * 0.11;
			sindicateContribution = grossSalary * 0.03;
			totalDiscount = irsTax + sindicateContribution;
			netSalary = grossSalary - totalDiscount;
		} else if (grossSalary > 2500 && grossSalary > 2500) {
			irsTax = grossSalary * 0.20;
			socialSecurityTax = grossSalary * 0.11;
			sindicateContribution = grossSalary * 0.03;
			totalDiscount = irsTax + sindicateContribution;
			netSalary = grossSalary - totalDiscount;
		} else {
			System.out.println("Invalid value. Try again or contact the administrator.");
		}
		
		
		System.out.println("\nGross Salary: (" + hourValue + " * " + workedHours + ") : " + grossSalary);
		System.out.printf("(-) IRS (5%%) : %.2f\n", irsTax);
		System.out.printf("(-) Social Security Tax (11%%):  %.2f\n", socialSecurityTax);
		System.out.printf("(-) Sindicate Contribution (3%%):  %.2f\n", sindicateContribution);
		System.out.println("Total of discount : " + totalDiscount);
		System.out.println("Net Salary : " + netSalary);
		
		
		
		sc.close();		
	}
}



