package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 10. This App will receives 2 numbers 
// and will present the integer number between of them (not inclusive).
// beside of the last one , it will present the sum of the numbers within interval.


public class Exerc10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, num1, num2, sum;

		System.out.println("Please, enter the number #1: ");
		num1 = sc.nextInt();

		System.out.println("Please, enter the number #2: ");
		num2 = sc.nextInt();

		sum = 0;

		if (num1 < num2) {
			i = num1 + 1;
			while (i > num1 && i < num2) {
				System.out.print(i + " ");
				sum += i;
				i++;

			}
		} else if (num1 > num2) {
			i = num2 + 1;
			while (i < num1 && i > num2) {
				System.out.println(i + " ");
				sum += i;
				i++;
			}
			;

		} else {
			i = num1 = num2;
			System.out.println(i + " ");
			sum += i;
		}

		System.out.println("\nThe total sum is: " + sum);
		sc.close();

	}

}
