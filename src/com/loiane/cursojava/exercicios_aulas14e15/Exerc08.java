package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 8. This App should read 3 values for products and advise to buy the cheaper.

public class Exerc08 {

	public static void main(String[] args) {
		
		double priceProduct01, priceProduct02, priceProduct03;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please, enter the price for Product01: ");
		priceProduct01 = sc.nextDouble();
		
		System.out.println("Please, enter the price for Product02: ");
		priceProduct02 = sc.nextDouble();
		
		System.out.println("Please, enter the price for Product03: ");
		priceProduct03 = sc.nextDouble();
		
		
		if(priceProduct01 < priceProduct02 && priceProduct01 < priceProduct03) {
			System.out.println("You should buy the product01. Price is "+priceProduct01);
		} else if (priceProduct02 < priceProduct01 && priceProduct02 < priceProduct03) {
			System.out.println("You should buy the product02. Price is "+priceProduct02);
		} else {
			System.out.println("You should buy the product03. Price is "+priceProduct03);
		}
		
		sc.close();
	}

}
