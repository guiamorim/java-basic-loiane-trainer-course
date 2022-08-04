package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 1. Faça um programa que peça dois número e imprima
// o maior deles.

public class Exerc01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double numero1, numero2;

		System.out.println("Informe dois números diferentes para retornar o maior deles");

		System.out.println("Digite um primeiro número: ");
		numero1 = sc.nextDouble();

		System.out.println("Digite o outro número: ");
		numero2 = sc.nextDouble();

		if (numero1 < numero2) {
			System.out.println("O maior número digitado foi: " + numero2);
		} else {
			System.out.println("O maior número digitado foi :" + numero1);
		}
		sc.close();

	}

}
