package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;


// 13. THis app will calculate the power (of), without use the API Math.pow, the first number provided by user based on the second one.
// At the end will return the result
public class Exerc13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		
		double base, exponent, product;
		int count = 0;
		
		System.out.println("Please, enter a number to be the base:");
		base = sc.nextDouble();
		
		System.out.println("Please, enter a number to be the exponent:");
		exponent = sc.nextDouble();
		product = base;
		
		while (count < exponent) {
			product *= exponent;
			
			//System.out.println(product); --> Only to follow-up the results at each loop.
			count++;
		}
		System.out.println("" + base + " to the power (of) " + exponent + " = " + product);
		
//		System.out.printf("%.f to the power (of) %.2f is %.2f", base, exponent, product);
		
		sc.close();
	}

}
