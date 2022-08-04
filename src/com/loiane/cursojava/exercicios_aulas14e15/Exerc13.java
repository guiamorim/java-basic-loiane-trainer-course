package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 13. This App reads a number between 1 and 7 and returns the correpondent day of week.
// Also returna a warning message case user enter a number out of the intended range.

public class Exerc13 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);

int diaDaSemana;

System.out.println("Please enter a number between 1 and 7 to return a day of week.");

diaDaSemana = sc.nextInt();

		switch(diaDaSemana) {
		
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuersday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid option, please try again and enter a number between 1 and 7.");
		}
		
		sc.close();
	}

}
