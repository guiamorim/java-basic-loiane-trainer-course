package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		
		if(idade >= 18 && idade <60) {
			System.out.println("É adulto e maior de idade");
		}else { // forma de aninhar condições
			if(idade <= 12){ 
				System.out.println("É criança");
			}else if(idade >12 && idade < 18) { // segunda forma de aninhar condições. Mais utilizada.
				System.out.println("É adolescente");
			}else {
				System.out.println("É idoso");
			}	
		}

		sc.close();
		
	}

}
