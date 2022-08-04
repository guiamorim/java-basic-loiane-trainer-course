package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 20. This App will return a recognizing of the participation level in a crime based on 5 responses.
public class Exerc20 {

	public static void main(String[] args) {

		boolean answer = false;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("ANALYSIS AND EVIDENCES ABOUT CRIME: CASE 414. \n");

		System.out.println("Please, answer the next 5 questions with (true or false). \n");

		System.out.println("1. Did you call to the victim?");
		answer = sc.nextBoolean();
		if (answer) {
			count++;
		}

		System.out.println("2. Did you was there in local crime?");
		answer = sc.nextBoolean();
		if (answer) {
			count++;
		}

		System.out.println("3. Do you live close of victim house?");
		answer = sc.nextBoolean();
		if (answer) {
			count++;
		}

		System.out.println("4. Did you owed victim money?");
		answer = sc.nextBoolean();
		if (answer) {
			count++;
		}

		System.out.println("5. Have you worked with him before?");
		answer = sc.nextBoolean();
		if (answer) {
			count++;
		}

		System.out.println("Analyzing the answers...");
		System.out.print("You are classified as: ");
		if (count == 2) {
			System.out.println("SUSPICIOUS.");
		} else if (count < 2) {
			System.out.println("INNOCENT.");
		} else if (count == 5) {
			System.out.println("THE KILLER.");
		} else {
			System.out.println("COMPLICIT");
		}
	
		sc.close();
	}

}
