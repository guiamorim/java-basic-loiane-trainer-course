package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;


// 6. This App reads 3 numbers and provide results for the higher than them.

public class Exerc06 {

	public static void main(String[] args) {
		
		double number1, number2, number3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which number is the high?\n\nEnter 3 different numbers\n");
		
		System.out.println("Please, enter the first value:");
		number1 = sc.nextDouble();

		System.out.println("Please, enter the second value:");
		number2 = sc.nextDouble();
		
		System.out.println("Please, enter the third value:");
		number3 = sc.nextDouble();
		
		System.out.println("\nThe numbers chosen are:");
		System.out.println("Number01 => " + number1);
		System.out.println("Number02 => " + number2);
		System.out.println("Number03 => " + number3);

		
		if(number1 > number2 && number2 > number3) {
			System.out.println("\nThe higher number typed is Number01: " + number1);
		}else if (number2 > number1 && number2 > number3) {
			System.out.println("The higher number typed is Number02: " + number2);
		}else if (number3 > number1 && number3 > number1) {
			System.out.println("The higher number typed is Number03: " + number3);
		}else {
			System.out.println("One value should be different. Please try to type a number with the different values ");
		}
		
		sc.close();
	}

}
