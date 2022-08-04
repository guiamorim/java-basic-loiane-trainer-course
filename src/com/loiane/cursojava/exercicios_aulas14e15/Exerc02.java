package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 2. Faça um programa que peça um valor e mostre na tela
// se o valor é positivo ou negativo.

public class Exerc02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para saber se é negativo ou positivo");

		double valor = sc.nextDouble();

		if (valor < 0) {
			System.out.println("O valor " + valor + " é negativo.");
		} else {
			System.out.println("O valor " + valor + " é positivo.");
		}

		sc.close();
	}

}
