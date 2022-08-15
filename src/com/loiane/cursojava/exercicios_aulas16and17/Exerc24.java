package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 24. This app returns the price table from a bakehouse based on a bread price informed by user. 
// This price table cover until the 50th item.

public class Exerc24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("Bakehouse - Price table");
		System.out.println("=================================\n");
		
		System.out.println("Inform the updated today price for bread.");
		double breadPrice = sc.nextDouble();
		
		System.out.printf("Today Bread Price: $ %.2f%n",breadPrice);
		for(int count = 1 ; count <= 50; count ++) {
			System.out.printf("%d - $%.2f%n", count, (breadPrice * count));
		}
		System.out.println("=================================");
		
		sc.close();
	}

}

