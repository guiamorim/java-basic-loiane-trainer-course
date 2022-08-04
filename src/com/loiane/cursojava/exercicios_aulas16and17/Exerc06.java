package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		int count, option;

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose an option");
		System.out.println("1-for vertical result.");
		System.out.println("2-for horizontal result.");

		option = sc.nextInt();

		switch (option) {
		case 1:
			for (count = 0; count <= 20; count++) {
				System.out.println(count);
			}
			break;
		case 2:
			for (count = 0; count <= 20; count++) {
				System.out.print(count + " ");
			}
			break;
		default:
			System.out.println("Invalid input.");
		}

		sc.close();
	}

}
