package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 9. This App should read 3 numbers and return it in decrescent order.

public class Exerc09 {

	public static void main(String[] args) {
		
		int num01, num02, num03;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a total of 3 numbers separated by enter.");
		
		num01 = sc.nextInt();
		num02 = sc.nextInt();
		num03 = sc.nextInt();
		
		if(num01 < num02 && num02 < num03) {
			System.out.printf("%d, %d, %d", num01, num02, num03);
		} else if (num02 < num03 && num03 < num01) {
			System.out.printf("%d, %d, %d", num02, num03, num01);
		} else if (num03 < num01 && num01 < num02) {
			System.out.printf("%d, %d, %d", num03, num01, num02);
		} else if ( num01 < num03 && num03 < num02 ) {
			System.out.printf("%d, %d, %d", num01, num03, num02);
		} else if ( num02 < num01 && num01 < num03 ) {
			System.out.printf("%d, %d, %d", num02, num01, num03);
		} else {
			System.out.printf("%d, %d, %d", num03, num02, num01);
		}
		sc.close();

	}

}
