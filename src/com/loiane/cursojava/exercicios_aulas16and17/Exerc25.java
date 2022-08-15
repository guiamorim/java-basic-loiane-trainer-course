package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 25. This app will simulate a simple checkout

public class Exerc25 {

	public static void main(String[] args) {

		System.out.println("========================");
		System.out.println("     TABAJARA STORE     ");
		System.out.println("========================");

		Scanner sc = new Scanner(System.in);

		int count = 1;
		double price = 0;
		double total = 0;
		double cashPayment = 0;
		double change = 0;

		System.out.println("Please inform the price for each product:");

		// Should enter price == 0 to jump out of looping
		
		do {
			price = sc.nextDouble();
			System.out.printf("Product %d: €%.2f%n", count, price);
			count++;
			total += price;
		} while (price != 0);

		System.out.printf("Total: € %.2f%n", total);

		System.out.println("Please, inform the value of payment:");
		cashPayment = sc.nextDouble();

		System.out.printf("Payment €%.2f%n", cashPayment);

		while (total > cashPayment) {
			if (cashPayment < total) {
				System.out.println("CashPayment is not enough.");
				System.out.printf("Lack: €%.2f%n", (total - cashPayment));
				System.out.println("Please enter the lack value or more:");
				cashPayment += sc.nextDouble();
			}
		}
		change = cashPayment - total;
		System.out.printf("Change €%.2f%n", change);

		System.out.println("...");
		sc.close();
	}

}
