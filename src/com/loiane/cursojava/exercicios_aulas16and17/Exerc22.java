package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;
// 22. This app should return the total value invested on a CD Collection an also the average invested per each CD from the collection.
public class Exerc22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many CDs there are in your collection?");
		
		int cdQuantity = sc.nextInt();
		int count = 0;
		double totalInvestedOnCdCollection = 0;		
		do {
			System.out.printf("\nEnter the value invested for CD %d of this collection:\n", (count+1));
			double cdUnitaryPrice = sc.nextDouble();
			
			totalInvestedOnCdCollection += cdUnitaryPrice;
			count++;
		}while(cdQuantity > count);
		
		System.out.println("The total invested on this CD collection is: " + totalInvestedOnCdCollection + ".");
		System.out.printf("The average value invested per CD of this collection is %.2f.:%n",(totalInvestedOnCdCollection / cdQuantity));
		
		sc.close();
	}

}
