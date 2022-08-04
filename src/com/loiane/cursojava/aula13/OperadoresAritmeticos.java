package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1+2;
		System.out.println(resultado);
		
		resultado -= 1;
		System.out.println(resultado);
		
		resultado = resultado *2;
		System.out.println(resultado);
		
		resultado = resultado /2;
		System.out.println(resultado);
		
		resultado +=8;
		System.out.println(resultado);
		
		resultado %= 7;
		System.out.println(resultado);

		String primeiroNome = "Esta é";
		String segundoNome = "uma String concateada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
	
	
		resultado = resultado +1;
		System.out.println(resultado); //4
		
		resultado++;
		System.out.println(resultado); //5
		
		System.out.println(resultado++); // imprime ainda 5 e depois adiciona o valor.
		System.out.println(++resultado); //7, primeiro adiciona o valor e depois imprime o valor.
		
		System.out.println(resultado--);
		System.out.println(--resultado);
	}

}
