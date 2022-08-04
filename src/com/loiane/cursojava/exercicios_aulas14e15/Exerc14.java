package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;


// 15. This App reads 2 values for grade 1 and grade 2 and calculate the average.
// Also assign a grade level accordingly the average between the 2 grade values.
// At the end output the resume and the final result if aproved or reproved.


public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double grade1, grade2, average;
		String finalGrade = "";
		
		System.out.println("        Average         Grade\n");
		System.out.println("⚬ Between 9.0 and 10.0    A");
		System.out.println("⚬ Between 7.5 and 9.0     B");
		System.out.println("⚬ Between 6.0 and 7.5     C");
		System.out.println("⚬ Between 4.0 and 6.0     D");
		System.out.println("⚬ Between 4.0 and 0.0     E");

		System.out.println("\nPlease enter two grade values:");
		System.out.println("First grade value:");
		grade1 = sc.nextDouble();
		System.out.println("Second grade value:");
		grade2 = sc.nextDouble();
		
		average = (grade1+grade2)/2;
		
		//Grade evaluation
		if(average >= 9 && average <=10) {
			finalGrade = "A";
		} else if(average >= 7.5 && average < 9.0) {
			finalGrade = "B";
		} else if(average >= 6 && average < 7.5) {
			finalGrade = "C";
		} else if(average >= 4 && average < 6) {
			finalGrade = "D";
		} else if(average >= 0 && average < 4 ) {
			finalGrade = "E";
		} else {
			System.out.println("Invalid value. Please check the value informed and try again.");;
		}
		
		//Final result output
		switch(finalGrade) {
		case "A":
		case "B":
		case "C":
			System.out.println("Final result: APROVED");
			System.out.println("Average: " + average);
			System.out.println("Final grade: " + finalGrade);
			break;
		case "D":
		case "E":
			System.out.println("Final result: REPROVED");
			System.out.println("Average: " + average);
			System.out.println("Final grade: " + finalGrade);
			break;
			default:
				System.out.println("Invalid value. Please check the value informed and try again.");
		
		sc.close();
		
		}
	}

}
