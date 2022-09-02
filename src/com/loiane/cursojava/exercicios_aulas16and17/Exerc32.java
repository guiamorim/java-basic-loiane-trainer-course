package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {

		int code, option;
		String product;
		double price, priceTotal;
		
		Scanner sc = new Scanner(System.in);

		option = sc.nextInt();
		
		
		System.out.println("Especification         Code       Price");
		
		
		priceTotal = 0;
		do {
			switch (option) {
	
			case 100:
				code = 100;
				product = "Hotdog";
				price = 1.20;
				System.out.println("" + product + " " + code + "   - €" + price);
				priceTotal += price;
				break;
			case 101:
				code = 101;
				product = "Common Sandwich";
				price = 1.30;
				System.out.println("" + product + " " + code + "   - €" + price);
				priceTotal += price;
				break;
			case 102:
				code = 102;
				product = "Egg Sandwich";
				price = 1.50;
				System.out.println("" + product + " " + code + "   - €" + price);
				priceTotal += price;
				break;
			case 103:
				code = 103;
				product = "Hamburguer";
				price = 1.20;
				System.out.println("" + product + " " + code + "   - €" + price);
				priceTotal += price;
				break;
			case 104:
				code = 104;
				product = "ChessBurguer";
				price = 1.30;
				System.out.println("" + product + " " + code + "   - €" + price);
				priceTotal += price;
				break;
			case 105:
				code = 105;
				product = "Soda";
				price = 1.00;
				System.out.println("" + product + " " + code + "   - €" + price);
				priceTotal += price;
				break;
			case 0:
				System.out.println("Total: " + priceTotal);
			default:
			}
			System.out.println("Please enter the next product code or type 0 if you want to pay the bill.");
			option = sc.nextInt();
		} while(option != 0);

		sc.close();
	}

}
