package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		// Currency = EUR, get the quotation compared to BRL
		System.out.print("Please, enter que EUR quotation: ");
		double currencyQuotation = sc.nextDouble();
		
		double[] quotations = new double[20];
		
		//populating the de array with cotations
		for(int i = 0;i< quotations.length; i++) {
			quotations[i] = currencyQuotation * (i+1);
		}
		
		//Print the array content
		for(int i = 0; i < quotations.length; i++) {
			System.out.printf("%d - €%.2f%n", (i+1),quotations[i]);
		}
	
		sc.close();
	}

}
