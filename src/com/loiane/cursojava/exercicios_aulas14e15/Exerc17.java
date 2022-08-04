package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;


// 17. This App evaluate if a year is a leap year or not and return a output to user.

public class Exerc17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		
		System.out.println("Please inform a year to validate if it's a leap year.");
		
		year = sc.nextInt();
		
		// IN case need to check the calculation, uncomment the next rows.
//		System.out.println(year%4);
//		System.out.println(year%100);
//		System.out.println(year%400);
		
		if( year%4 == 0 | year%400 == 0) {
			System.out.println("This year, " + year + " is a leap year.");
		} else if (year%4 == 0 && year%100 != 0){
			System.out.println("This year, " + year + " is a leap year.");
		}
		else {
			System.out.println("This year is not a leap year");
		}
		
		sc.close();
	}

}
