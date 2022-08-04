package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 4. Faça um program que peça uma letra e identifique se a letra informada
//é uma vogal ou consoante.

public class Exerc04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String letra;

		System.out.println("Entre com uma letra.");

		letra = sc.next().strip().toLowerCase();
		if (letra.length() != 1) {
			System.out.println("Entre apenas com uma letra.");
		} else {

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("A letra \"" + letra + "\" é uma vogal");
				break;
			default:
				System.out.println("A letra \"" + letra + "\" é uma consoante");
			}
		}

		sc.close();

	}

}
