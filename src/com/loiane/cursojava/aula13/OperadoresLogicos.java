package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		
		boolean resultado1 = (valor1 == 1) && (valor2 ==2);
		System.out.println("valor1 é 1 AND valor2 é 2 -> resultado: ");

		
		boolean resultado2 = (valor1 == 1) || (valor2 ==2);
		System.out.println("valor1 é 1 OR valor2 é 2 -> resultado: ");
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro & falso); //AND vai analisar a segunda condição, mesmo se a primeira for falsa
		System.out.println(verdadeiro && falso); //AND e não vai analisar a segunda condição caso a primeira ja seja falsa
		System.out.println(verdadeiro | falso); // OR, analisa a segunda condição
		System.out.println(verdadeiro || falso); //OR
		System.out.println(verdadeiro ^  falso); //XOR
		System.out.println(!verdadeiro); // NEGACAO
	}

}
