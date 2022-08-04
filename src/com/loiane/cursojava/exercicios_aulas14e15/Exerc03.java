package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 3. Faça um programa que verifgique se a letra digitada é 
// F ou M. COnforme a letra escrever F - Feminino, M- Masculino,
// Indiferente.
public class Exerc03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe M ou F.");

		String valor = sc.next().strip().toUpperCase();

		switch (valor) {
		case "M":
			System.out.println("M - Masculino");
			break;
		case "F":
			System.out.println("F - Feminino");
			break;
		default:
			System.out.println("Indiferente");
		}

		sc.close();
	}

}
