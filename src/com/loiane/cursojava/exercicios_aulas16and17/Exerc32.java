package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {

		int code, option, quantity;
		String product;
		double price, itemTotal, priceTotal;

		Scanner sc = new Scanner(System.in);

		System.out.println("|=====================================|");
		System.out.println("|                MENU                 |");
		System.out.println("|=====================================|");
		System.out.println("| Product		Code	Price |");
		System.out.println("|-------------------------------------|");
		System.out.println("| - Hotdog		100	€1.20 |");
		System.out.println("| - Common Sandwich	101	€1.30 |");
		System.out.println("| - Egg Sandwich	102	€1.50 |");
		System.out.println("| - Hamburguer		103	€1.20 |");
		System.out.println("| - ChessBurguer	104	€1.30 |");
		System.out.println("| - Soda		105	€1.00 |");
		System.out.println("|=====================================|");

		System.out.print("\n Please, enter the product code: ");
		option = sc.nextInt();

		priceTotal = 0;
		do {
			switch (option) {

			case 100:
				code = 100;
				product = " Hotdog";
				price = 1.20;
				System.out.print(" Quantity? ");
				quantity = sc.nextInt();
				itemTotal = price * quantity;
				System.out.printf("%s - %d x € %.2f = %.2f", product, quantity, price, itemTotal);
				priceTotal += itemTotal;
				break;
			case 101:
				code = 101;
				product = " Common Sandwich";
				price = 1.30;
				System.out.print(" Quantity? ");
				quantity = sc.nextInt();
				itemTotal = price * quantity;
				System.out.printf("%s - %d x €%.2f = %.2f", product, quantity, price, itemTotal);
				priceTotal += itemTotal;
				break;
			case 102:
				code = 102;
				product = " Egg Sandwich";
				price = 1.50;
				System.out.print(" Quantity? ");
				quantity = sc.nextInt();
				itemTotal = price * quantity;
				System.out.printf("%s - %d x €%.2f = %.2f", product, quantity, price, itemTotal);
				priceTotal += itemTotal;
				break;
			case 103:
				code = 103;
				product = " Hamburguer";
				price = 1.20;
				System.out.print(" Quantity? ");
				quantity = sc.nextInt();
				itemTotal = price * quantity;
				System.out.printf("%s - %d x €%.2f = %.2f", product, quantity, price, itemTotal);
				priceTotal += itemTotal;
				break;
			case 104:
				code = 104;
				product = " ChessBurguer";
				price = 1.30;
				System.out.print(" Quantity? ");
				quantity = sc.nextInt();
				itemTotal = price * quantity;
				System.out.printf("%s - %d x €%.2f = %.2f", product, quantity, price, itemTotal);
				priceTotal += itemTotal;
				break;
			case 105:
				code = 105;
				product = " Soda";
				price = 1.00;
				System.out.print(" Quantity? ");
				quantity = sc.nextInt();
				itemTotal = price * quantity;
				System.out.printf("%s - %d x €%.2f = %.2f", product, quantity, price, itemTotal);
				priceTotal += itemTotal;
				break;
			default:
				System.out.println("\n This product code isn't valid, please re-enter a valid one.");
			}
			System.out.println("\n Please, enter the next product code or 0 to close the order.");
			option = sc.nextInt();
		} while (option != 0);

		System.out.println("|=====================================|");
		System.out.printf("| Total:....................... €%.2f |\n", priceTotal);
		System.out.println("|=====================================|");

		sc.close();
	}

}
