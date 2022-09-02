package com.loiane.cursojava.exercicios_aulas16and17;

// 33. This App based on a for looping for two different variables with two different increments.
// At the end, will show all element in a row and calculates the sum from them considering the nbr of repetitions choosen.


public class Exerc33 {

	public static void main(String[] args) {


		double n = 1;
		double m = 1;
		int rep =5; // nbr of repetitions
		double sum = 0;

		System.out.println("Nbr. of elements on serie: " + rep);
		System.out.print("\ns = ");
		
		for (int i = 0; rep > i; n++, m +=2, i++) {
			System.out.printf("%.0f/%.0f + ", n,m);
			//double x = (n/m); // validation of value
			//System.out.printf("%f%n", x); // validation of value
			sum = sum + (n / m);
		}
		
		System.out.println("... + n/m.");
		System.out.printf("\nSum of elements on serie: %.2f", sum);
		
	}

}
