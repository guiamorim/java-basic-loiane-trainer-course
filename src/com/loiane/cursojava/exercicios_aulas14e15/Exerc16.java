package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;


// 16. This App will calculate the real roots for a second degree equation and inform user
// if there are real roots or not and whats is their values.

public class Exerc16 {

	public static void main(String[] args) {
		
		double a, b, c, x1, x2, delta;
		a = 0;
		b = 0;
		c = 0;
		x1 = 0;
		x2 = 0;
		delta = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for variable A:");
		a = sc.nextDouble();
		
		System.out.println("Enter a value for variable B:");
		b = sc.nextDouble();
		
		System.out.println("Enter a value for variable C:");
		c = sc.nextDouble();
		
		
		
		if(a == 0) {
			System.out.println("Value A is equal to 0. Due it the equantion is not a  2nd degree equantion, and can't be resolved.");
		}else {
			delta = Math.pow(b, 2) - (4 * (a * c));
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			//These out.prints may be uncommented in order to validate the values
//			System.out.println(delta);
//			System.out.println(x1);
//			System.out.println(x2);
			if(delta < 0) {
				System.out.println("The delta value = " + delta + ". This equantion doesn't have a real roots.");
			} else if ( delta == 0 && x1 == x2) {
				System.out.println("This delta only has one real root.");
				System.out.println("Real root: " + x1);
			} else {
				System.out.println("The real roots are:");
				System.out.println("x': " + x1);
				System.out.println("x'': " + x2);
			}
		}
		
		sc.close();

	}

}
