package com.loiane.cursojava.exercicios_aulas16and17;


// 23. This app returns the price table based on a store where all itens costs $1.99 
// This price table cover until the 50th item.

public class Exerc23 {

	public static void main(String[] args) {
		
		System.out.println("=================================");
		System.out.println("Almost $2 Store - Price table");
		System.out.println("=================================\n");
		
		
		for(int count = 1 ; count <= 50; count ++) {
			System.out.println("" + count + " - $ " + (1.99 * count));
		}
		System.out.println("=================================");
	}

}
