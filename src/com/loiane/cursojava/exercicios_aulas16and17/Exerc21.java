package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 21. This app will ask for the number of class and how many students there are per class.
// Also will allow enter the maximum of 40 students per class.


public class Exerc21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many class do you wish to inform?");
		int classQuantity = sc.nextInt();

		int studentQuantity = 0;
		int studentAveragePerClass;
		int studentTotal = 0;
		int count = 0;

		do {
			System.out.println("How many student are subscribed into this class " + (count + 1) + "?");
			studentQuantity = sc.nextInt();

			if (studentQuantity > 40) {
				System.out.println("This quantity is not allowed for this class.");
				studentQuantity = 0;
				count--;
			}

			studentTotal += studentQuantity;
			count++;
		} while (classQuantity > count);

		studentAveragePerClass = studentTotal / classQuantity;

		System.out.println("The average student quantity per class is : " + studentAveragePerClass);

		sc.close();
	}

}