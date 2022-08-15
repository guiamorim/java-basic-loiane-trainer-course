package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 27. This app will capture different temperature value and will define the max and min values.
// Also will show the average temperature.


public class Exerc27 {

	public static void main(String[] args) {

		double minTemp = 0;
		double maxTemp = 0;
		double averageTemp = 0;
		double temp = 0;
		double tempTemp = 0;
		int option;
		int counter = 0;
		boolean keepReading = true;

		Scanner sc = new Scanner(System.in);

		while (keepReading) {

			System.out.println("Please choose an option:");
			System.out.println("1 - Register a temperature.");
			System.out.println("2 - Exit");

			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Inform a temperature");
				temp = sc.nextDouble();

				counter++;
				break;
			case 2:
				keepReading = false;
				break;
			default:
				System.out.println("Invalid option.");
			}

			// Holding the maximum Temperature

			if (maxTemp <= temp) {
				maxTemp = temp;
			}

			// Holding the minimum Temperature

			if (minTemp >= temp) {
				minTemp = temp;
			}

			// Holding the Temperature average
			tempTemp = +temp;
			averageTemp = tempTemp / counter;
		}

		// Resume
		System.out.println("Resume Temperature:");
		System.out.println("===========");
		System.out.println("Qte registered: " + counter);
		System.out.println(tempTemp);
		System.out.println("Min: " + minTemp);
		System.out.println("Max: " + maxTemp);
		System.out.println("Avg: " + averageTemp);

		sc.close();
	}

}
