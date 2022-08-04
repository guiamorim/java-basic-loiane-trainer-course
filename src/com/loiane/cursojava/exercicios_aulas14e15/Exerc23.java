package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double quantity, value, discount;
		String mealType = null;
		int paymentType = 0;
		value = 0;
		discount = 0;


		System.out.println("Enter the meal type you wish");

		System.out.println("   Meals         |     up to 5Kg     |     Over 5Kg");
		System.out.println("---------------------------------------------------");
		System.out.println("1. Tenderloin    |     €4.90/Kg      |     €4.20/Kg");
		System.out.println("2. RumpSteak     |     €5.90/Kg      |     €5.50/Kg");
		System.out.println("3. Striploin     |     €6.90/Kg      |     €6.50/Kg");

		int optionMeal = sc.nextInt();

		System.out.println("Please enter the quantity:");
		quantity = sc.nextDouble();

		switch (optionMeal) {
		case 1:
			mealType = "Tenderloin";
			if (quantity <= 5) {
				value = 4.90;
			} else {
				value = 4.20;
			}
			break;
		case 2:
			mealType = "RumpSteak";
			if (quantity <= 5) {
				value = 5.90;
			} else {
				value = 5.20;
			}
			break;
		case 3:
			mealType = "Striploin";
			if (quantity <= 5) {
				value = 6.90;
			} else {
				value = 6.50;
			}
			break;
		default:
			System.out.println("Invalid option");
		}

		
		// Choose the payment type
		
		System.out.println("Choose a payment type:");
		System.out.println("1. Client Card");
		System.out.println("2. Credit Card");
		System.out.println("3. Debit Card");
		System.out.println("4. Cash");
		
		paymentType = sc.nextInt();
		
		switch (paymentType) {
		case 1:
			discount = quantity * value * 0.05;
			break;
		case 2:
		case 3:
		case 4:
			discount = 0;
			break;
		default:
			System.out.println("Invalid option");
		}

		// Invoice
		System.out.println("===========================");
		System.out.println("     INVOICE     " + "Nbr:" + Math.random() + 1);
		System.out.println("===========================");
		System.out.println("\nPaymentType: " + paymentType);
		System.out.println("Meal         Price        Qty ");
		System.out.println("------------------------------");
		System.out.println(mealType + "	" + value + "	" + quantity);
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("Discount:" + discount);
		System.out.println("Total: " + quantity * value);
		System.out.println("Total final: " + ((quantity * value) - discount));

		sc.close();
	}

}
