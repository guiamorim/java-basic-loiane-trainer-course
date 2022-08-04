package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {

		System.out.println("Fruits         |     up to 5Kg     |     Over 5Kg");
		System.out.println("-------------------------------------------------");
		System.out.println("Strawberry     |     €2.50/Kg      |     €2.20/Kg");
		System.out.println("Apple          |     €1.80/Kg      |     €1.50/Kg");
		
		double quantityApple = 0;
		double totalApple = 0;
		double quantityStrawberry = 0;
		double totalStrawberry = 0;
		//double discount = 0;
		double finalTotal;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPlease enter the quantity of Apple (Kg)");
		quantityApple = sc.nextDouble();
		
		System.out.println("Please enter the quantity of Strawberry (Kg)");
		quantityStrawberry = sc.nextDouble();
		
		if((quantityApple + quantityStrawberry) > 8) {
			totalApple = quantityApple * 1.80;
			totalStrawberry = quantityStrawberry * 2.50;
			finalTotal = (totalApple + totalStrawberry) * 0.90;
		}else {
			totalApple = quantityApple * 1.80;
			totalStrawberry = quantityStrawberry * 2.50;
			finalTotal = (totalApple + totalStrawberry);
		}
		
		System.out.println("Total cost: " + finalTotal);
		
		sc.close();
	}

}
