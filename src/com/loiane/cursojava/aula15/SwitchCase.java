package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um número entre 1 e 7 para retornar um dia da semana");

		int diaDaSemana = sc.nextInt();
		
		// Usando o os operadores condicionais If e Else
		
		/*
		if (diaDaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaDaSemana == 2) {
			System.out.println("Segunda-feira");
		} else if (diaDaSemana == 3) {
			System.out.println("Terça-feira");
		} else if (diaDaSemana == 4) {
			System.out.println("Quartaa-feira");
		} else if (diaDaSemana == 5) {
			System.out.println("Quinta-feira");
		} else if (diaDaSemana == 6) {
			System.out.println("Sexta-feira");
		} else if (diaDaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Opção inválida");
		}
		 */	
		
		
		// Usando operador condicional Switch Case
		
		
		
		switch(diaDaSemana){
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6: 
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		switch(diaDaSemana){
			case 1:
				System.out.println("Fim de semana");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia útil");
				break;
			case 7:
				System.out.println("Fim de semana");
				break;
				default: 
					System.out.println("Opção inválida");
					
		}
		
		
		
		
	}

}
