package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		double num1, num2, result;
		int operationChoice = 0;
		
		num1 = 0;
		num2 = 0;
		result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		System.out.println("Please choose a option:");
		System.out.println("1 - SUM");
		System.out.println("2 - SUBTRACTION");
		System.out.println("3 - MULTIPLICATION");
		System.out.println("4 - DIVISION");
		System.out.println("0 - EXIT");
		
		operationChoice = sc.nextInt();
		
		switch(operationChoice) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			if(num2 == 0) {
				System.out.println("This operation can't be performed. Number2 must be different of 0.");
			}else {
			result = num1 / num2;
			}
			break;
		case 0:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid option.");
		}
		
		System.out.println("The result is: " + result);
		
		if(result%2 == 0 && result >= 0) {
			System.out.println("This result is even and the value is positive");
		} else if (result%2 == 0 && result < 0) {
			System.out.println("This result is even and the value is negative");
		} else if (result%2 != 0 && result > 0) {
			System.out.println("This result is odd and the value is positive");
		} else {
			System.out.println("This result is odd and the value is negative");
		}
		
		sc.close();
	}

}
