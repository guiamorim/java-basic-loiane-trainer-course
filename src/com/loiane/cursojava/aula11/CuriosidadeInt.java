package com.loiane.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		//over da variável
		byte varA = 127;
		byte varB = 3;
		
		System.out.println(varA + varB);
		
		//Principais caracteres de escape /
		
		System.out.println("Impressão normal, com retorno de linha");
		System.out.print("Impressão normal, sem retorno de linha");
		System.out.print("Impressão normal, com retorno de linha \r");
	
		//Separar numeros com _
		
		long creditCardNumber = 1234_4567_4567_6789L;
		
		// o _ não pode estar no incio do numero e nem no final,
		// Também não pode estar entre o prefixo e o numero no caso de numero hexadecimais e octais.
		
	
	
	}

}
