package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 14. This App will receives some numbers and will validate and return which of them are odd or even numbers.


public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you wish to validate:");
		
		int quantity = sc.nextInt();
		int count = 0;
		int evenNumbers = 0;
		int oddNumbers = 0;
		
		
		while (count < quantity) {
			System.out.println("Please, enter a number:");
			int num = sc.nextInt();
			count++;
			
			if(num%2==0) {
				evenNumbers += 1;
			} else {
				oddNumbers += 1;
			}
		}
		
		System.out.println("Even Numbers: " + evenNumbers);
		System.out.println("Odd Numbers: " + oddNumbers);
		
		sc.close();
	}

}
