package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int num;
//		System.out.println("Please, inform a number to receive a factorial value");
//		num = sc.nextInt();
//
//		int count = num - 1;
//		int factorial = 0;
//
//		System.out.println("Calculating ...");
//		
//		System.out.print("" + num + "! = " + num);
//
//		while (count > 0) {
//			num *= count;
//			factorial = num;
//			System.out.print("" + "." + count);
//			count--;
//		}
//
//		System.out.println("" + " = " + factorial);
		
		
		
		// or
		
		int num2;
		
		num2 = sc.nextInt();
		
		int count2 = 1;
		int factorial2 = 0;
		int temp = 0;
		
		System.out.println("Calculating ...");
		
		System.out.print("" + num2 + "! = " + num2);
		while (count2 < num2) {
//			if(count2 == 0) {
			temp *= num2 * (num2 - count2);
			factorial2 = temp;
			System.out.print("" + "." + (num2 - count2));
			count2++;
			//break;
//			}
		}
		
		System.out.println("" + " = " + factorial2);

		sc.close();
	}

}
