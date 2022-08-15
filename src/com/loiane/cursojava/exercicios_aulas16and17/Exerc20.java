package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;


// 20. This app will ask the quantity of the years old age to input. Then will
// calculate the average and evaluate the respective type os clas based on the average result.

public class Exerc20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double averageOld = 0;
		int ageTemp, studentsTotalQuantity;
		int ageTotal = 0;
		int count = 0;

		System.out.println("How many people do you want to get the year old age data?");
		studentsTotalQuantity = sc.nextInt();

		do {
			System.out.println("Please, inform the year old age:");
			ageTemp = sc.nextInt();
			ageTotal += ageTemp;
			count++;

		} while (studentsTotalQuantity > count);

		averageOld = ageTotal / studentsTotalQuantity;
		
		if(averageOld > 0 && averageOld < 25) {
			System.out.println("This class is a younger class.");
		}else if (averageOld > 25 && averageOld < 60) {
			System.out.println("This class is a adult class.");
		}else {
			System.out.println("This is a experienced class.");
		}

		sc.close();

	}

}
