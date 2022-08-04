package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*
		System.out.println("Digite seu nome completo:");
		
		String nomeCompleto = teclado.nextLine();
		
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome");
		
		String primeiroNome = teclado.next();
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		
		int idade = teclado.nextInt();
		
		System.out.println("A sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		
		double altura = teclado.nextDouble();
		
		System.out.println("A sua altura é :" + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação.");
		
		String primeiroNome1 = teclado.next();
		int idade1 = teclado.nextInt();
		byte quantidadeFilhos = teclado.nextByte();
		float altura1 = teclado.nextFloat();
		boolean temAnimalEstimacao = teclado.nextBoolean();
		
		System.out.println("Estas foram as informações fornecidas:");
		
		System.out.println( "Primeiro Nome: "+ primeiroNome1 
							+"\nIdade: "+ idade1
							+"\nQuantidade de filhos: " + quantidadeFilhos 
							+"\nAltura: " + altura1
							+"\nPossui animal doméstico: " + temAnimalEstimacao
							);
		
	}

}
