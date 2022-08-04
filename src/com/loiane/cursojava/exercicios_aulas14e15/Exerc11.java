package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;


// 11. This App asks user which shift he/she studies and output a greetings.

public class Exerc11 {

	public static void main(String[] args) {
		
		char turno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please inform which shift do you study?");
		System.out.println("M - For morning");
		System.out.println("N - For noon");
		System.out.println("E - For evening");
		
		
		turno = sc.next().strip().toUpperCase().charAt(0);
		
		switch (turno) {
		case 'M':
			System.out.println("Good morning.");
			break;
		case 'N':
			System.out.println("Good afternoon.");
			break;
		case 'E':
			System.out.println("Good Evening.");
			default:
				System.out.println("Invalid option, please try again.");
				
				
				sc.close();
		}

	}

}
